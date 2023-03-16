package trainReservation.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import trainReservation.dto.GetReservationDto;
import trainReservation.dto.GetTrainListDto;
import trainReservation.dto.PostReservationDto;
import trainReservation.entity.Cost;
import trainReservation.entity.ReservationInfo;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

// Service class (계층)
// 실제 비지니스 로직을 담당 


public class ReservationService {
	
	private static List<Train> trains= new ArrayList<Train>();
	private static List<Cost> costs = new ArrayList<Cost>();
	private static List<ReservationInfo> reservations = new ArrayList<ReservationInfo>();
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	
	//--------------------------------------------------------------------------------------------------
	public ReservationService() {
		initData();
	}
	
	public List<Train> getPossibleTrainList(GetTrainListDto dto, LocalTime  departureTime){
		List<Train> possibleTrains = new ArrayList<>();
		for (Train train: trains) {//for 00 전체 열차 반복
			List<StopStation> stopStations =train.getStopStaions();
			
			int sameStationIndex  = -1;
			
			for(int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {//for 00.01 출발역, 출발시간 확인
				StopStation stopStation = stopStations.get(stopStationIndex);
				String stopStationName = stopStations.get(stopStationIndex).getStationName();
				
				if(!dto.isEqualDepartureStation(stopStationName)){
				continue;
				}
				if(stopStation.getDepartureTime().equals("")) {
					continue;
				}
			LocalTime stationDepartureTime = LocalTime.parse(stopStation.getDepartureTime(), timeFormatter);
			
				if(stationDepartureTime.isBefore(departureTime)) {
				break;  
				}
			
			
			sameStationIndex = stopStationIndex;
			break;
			
		}//for 00.01
		
			
			if(sameStationIndex == -1) {
				continue;
				}//for 00.01 로 알맞은 역을 찾지 못했으면 for 00으로 돌아가서 다음 열차를 확인함
			
			boolean isPossible = false;
			
			
			
			for(int stopStationIndex=0; stopStationIndex <= stopStations.size(); stopStationIndex++) { // for00. 02 도착역 확인
				String  stationName = stopStations.get(stopStationIndex).getStationName();
				
				if(!dto.isEqualArrivalStation(stationName)) {
					continue;
					}
				
				if (stopStationIndex <= sameStationIndex) {//stopStation 은 same StationIndex 보다 숫자가 커야함. 왜냐하면 도착역의 index는 출발역의 인덱스보다 커야하기 때문에 
					break;
					}
				isPossible =true;
				break;
			
			} //for 00.02
		
			if(!isPossible) {
				continue;
				} // for 00.02 결과로 찾지 못햇으면 다시 for 00 으로 돌아감
			
		
			List<Seat> seats = train.getSeats();
			
			int possibleSeatCount = 0;
			
			for (Seat seat: seats) {
				if(!seat.isSeatStatus()) {
					possibleSeatCount++;
				}
			}
			
			if  (possibleSeatCount < dto.getNumberOfPeople()) {
				continue;
				}
			
			possibleTrains.add(train);
			
	}//for00
		return possibleTrains;
		
	}
	
	//--------------------------------------------------------------------------------------------------
	
	public ReservationInfo postReservation(PostReservationDto postResrvationdto,GetTrainListDto getTrainListDto){
		
		Train train = null;//null 참조 변수일때 값이 지정되지 않은 상태 프로그래밍 언어 기준임. 데이터 베이스는 다름
	
		for(Train trainItem:trains) { // for00
			if(postResrvationdto.isEqualTrainNumber(trainItem.getTrainNumber())) {
				train= trainItem;
				break;
				
			}
			
		}//for00
		
		if(train == null) {
			System.out.println("존재하지 않는 열차입니다.");
			return null;
		}
		boolean desinationsState = true;
		List<Seat> seats= train.getSeats();
		List<String> inputSeatNames = postResrvationdto.getSeats();
		
		for (int index=0; index <seats.size(); index++) {//for01
			
			Seat seat = seats.get(index);
			
			for(String seatNumber:inputSeatNames) {//for 02
				if(!seat.getSeatNumber().equals(seatNumber)) {
					continue;
				}
				if(seat.isSeatStatus()) {
					desinationsState=false;
					break;
				}
				seat.setSeatStatus(true);
				break;
			}//for 02
			
			if(!desinationsState) {
				break;
			}
			
		}//for01
		if(!desinationsState) {
			System.out.println("좌석 배정에 실패 했습니다.");
			return null;
		}
		int totalCost = 0;
		for(Cost cost: costs) {//for03
			boolean isEqualDepartureStation = getTrainListDto.isEqualDepartureStation(cost.getDepartureStation());
			boolean isEqualArrivalStation = getTrainListDto.isEqualArrivalStation(cost.getArrivalStaiton());
			if(!isEqualDepartureStation || !isEqualArrivalStation) {
				continue;}
			totalCost = cost.getAmount()*getTrainListDto.getNumberOfPeople();
			break;
		}//for 03
		
		
		String departureTime = "";
		String arrivalTime="";
		
		for(StopStation stopStation : train.getStopStaions()) {//for 04
			boolean isEqualDepartureStation = getTrainListDto.isEqualDepartureStation(stopStation.getStationName());
			boolean isEqualArrivalStation = getTrainListDto.isEqualArrivalStation(stopStation.getStationName());
			if(isEqualDepartureStation) {
				departureTime = stopStation.getDepartureTime();
			}
			if(isEqualArrivalStation) {
				arrivalTime = stopStation.getArrivalTime();
			}
		}
		
		
		
		ReservationInfo reservationInfo = new ReservationInfo(postResrvationdto.getTrainNumber(),
				postResrvationdto.getSeats(),getTrainListDto.getDepartureStation(),departureTime,
				getTrainListDto.getArrivalStaion(),arrivalTime,totalCost);
		
		reservations.add(reservationInfo);
		return reservationInfo;
		
		
	}//ReservationInfo
	//-----------------------------------------------------------------------------------------
	
	
	public ReservationInfo getReservation(GetReservationDto dto) {
		
		ReservationInfo reservationInfo = null;
		String reservationNumber = dto.getReservationNumber();
		for(ReservationInfo item:reservations) {//for00
			boolean isEqualReservationNumber = reservationNumber.equals(item.getReservationNumber());
			
			if(!isEqualReservationNumber) {
				continue;
			}
			reservationInfo=item;
			break;
		}//for00
		
		
		return reservationInfo;
	}
	
	
	//-------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	//------------------------------------------------------------------------------------------
	
	
	private static void initData() {
		 List<Seat> seats= new ArrayList<Seat>();
		 List<StopStation> stopStaions = new ArrayList<StopStation>();

			costs.add(new Cost("부산역", "서울역", 30000));
			costs.add(new Cost("부산역", "대전역", 20000));
			costs.add(new Cost("부산역", "대구역", 10000));
			costs.add(new Cost("대구역", "서울역", 20000));
			costs.add(new Cost("대구역", "대전역", 10000));
			costs.add(new Cost("대전역", "서울역", 10000));
			
			costs.add(new Cost("서울역", "부산역", 30000));
			costs.add(new Cost("대전역", "부산역", 20000));
			costs.add(new Cost("대구역", "부산역", 10000));
			costs.add(new Cost("서울역", "대구역", 20000));
			costs.add(new Cost("대전역", "대구역", 10000));
			costs.add(new Cost("서울역", "대전역", 10000));
			
			// seat,stop station. 데이터 넣기
			
			
			seats.add(new Seat(1,"A1", false));
			seats.add(new Seat(1,"B1", false));
			seats.add(new Seat(1,"A2", false));
			seats.add(new Seat(1,"B2", false));
			seats.add(new Seat(2,"A1", false));
			seats.add(new Seat(2,"B1", false));
			seats.add(new Seat(2,"A2", false));
			seats.add(new Seat(2,"B2", false));
			seats.add(new Seat(3,"A1", false));
			seats.add(new Seat(3,"B1", false));
			seats.add(new Seat(3,"A2", false));
			seats.add(new Seat(3,"B2", false));
			
			
			stopStaions.add(new StopStation("서울역","", "06:00"));
			stopStaions.add(new StopStation("대전역","06:45", "07:00"));
			stopStaions.add(new StopStation("대구역","07:45", "08:00"));
			stopStaions.add(new StopStation("부산역","09:00", ""));
		
			Train train;
			train = new Train("KTX001", "서울역","06:00", "부산역", "09:00", 180, "KTX", stopStaions, seats);
			trains.add(train);
			
		
			seats= new ArrayList<Seat>();
			stopStaions = new ArrayList<StopStation>();
			
			seats.add(new Seat(1,"A1", false));
			seats.add(new Seat(1,"B1", false));
			seats.add(new Seat(1,"A2", false));
			seats.add(new Seat(1,"B2", false));
			seats.add(new Seat(2,"A1", false));
			seats.add(new Seat(2,"B1", false));
			seats.add(new Seat(2,"A2", false));
			seats.add(new Seat(2,"B2", false));
			seats.add(new Seat(3,"A1", false));
			seats.add(new Seat(3,"B1", false));
			seats.add(new Seat(3,"A2", false));
			seats.add(new Seat(3,"B2", false));
			
			
			stopStaions.add(new StopStation("브산역","", "09:00"));
			stopStaions.add(new StopStation("대구역","09:45", "10:00"));
			stopStaions.add(new StopStation("대전역","10:45", "11:00"));
			stopStaions.add(new StopStation("서울역","12:00", ""));
		
			

			train = new Train("KTX002", "부산역","09:00", "서울역", "12:00", 180, "KTX", stopStaions, seats);
			trains.add(train);
			
			
			
		}
//------------------------------------------------------------------------------------
	
}

