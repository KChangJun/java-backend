package trainReservation.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


import trainReservation.dto.ReservationDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

public class ReservationService {
	public static List<Train> trains = new ArrayList<>();
	public static List<Cost> costs = new ArrayList<>();
	List<Train> possibleTrainList = new ArrayList<>();
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	//----------------------------------------------------
	public ReservationService() {
		initData();
		}//ReservationService
	
	//---------------------------------------------------------------------------------------------------------------
	public List<Train> getPossibleTrainList(ReservationDto dto, LocalTime departureTime){

		
		
		
		for(Train train:trains) {
			List<StopStation> stopStations = train.getStopStaions();
			
			boolean possible01=false;
			boolean possible02=false;
			boolean possible03=false;
			boolean possible04=false;
			
	
			
			for(int stopStationIndex=0; stopStationIndex<train.getStopStaions().size(); stopStationIndex++) {
				StopStation stopStation = stopStations.get(stopStationIndex);
				LocalTime stopStationDepartureTime = LocalTime.parse(stopStation.getDepartureTime(),timeFormatter);
				if(!dto.getDepartureStation().equals(stopStation.getStationName())) {
					continue;
				}
				possible01=true;
				
				
				if(departureTime.isBefore(stopStationDepartureTime)) {
					possible02=true;
				}
				
				if(dto.getArrivalStation().equals(stopStation.getStationName())) {
					possible03=true;
				}
				if(possible01 && possible02 && possible03) {
					
					
				}
				
				
			}
				
				
			
			
			
			}//for
		
		return null;
	}
	//------------------------------------------------------------------------------------------------------------

	
	
	public static void initData() {
	
		List<StopStation> stopstations = new ArrayList<>();
		List<Seat> seats = new ArrayList<>();
		
		//Train A
		stopstations.add(new StopStation("부산역","","06:00"));
		stopstations.add(new StopStation("밀양역","07:00","07:15"));
		stopstations.add(new StopStation("대구역","08:15","08:30"));
		stopstations.add(new StopStation("김천역","09:30","09:45"));
		stopstations.add(new StopStation("대전역","10:45","11:00"));
		stopstations.add(new StopStation("세종역","12:00","12:15"));
		stopstations.add(new StopStation("서울역","13:15",""));
		
		seats.add(new Seat("1","창가01",false));
		seats.add(new Seat("1","복도01",false));
		seats.add(new Seat("1","창가02",false));
		seats.add(new Seat("1","복도02",false));
		seats.add(new Seat("2","창가01",false));
		seats.add(new Seat("2","복도01",false));
		seats.add(new Seat("2","창가02",false));
		seats.add(new Seat("2","복도02",false));
		seats.add(new Seat("3","창가01",false));
		seats.add(new Seat("3","복도01",false));
		seats.add(new Seat("3","창가02",false));
		seats.add(new Seat("3","복도02",false));
		
		trains.add(new Train("A","부산역","06:00","서울역","13:15",stopstations,seats));
		
		//Train B
		stopstations = new ArrayList<>();
		seats = new ArrayList<>();
		
		stopstations.add(new StopStation("부산역","","07:00"));
		stopstations.add(new StopStation("대구역","09:15","09:30"));
		stopstations.add(new StopStation("대전역","11:45","12:00"));
		stopstations.add(new StopStation("서울역","14:15",""));
		
		seats.add(new Seat("1","창가01",false));
		seats.add(new Seat("1","복도01",false));
		seats.add(new Seat("1","창가02",false));
		seats.add(new Seat("1","복도02",false));
		seats.add(new Seat("2","창가01",false));
		seats.add(new Seat("2","복도01",false));
		seats.add(new Seat("2","창가02",false));
		seats.add(new Seat("2","복도02",false));
		seats.add(new Seat("3","창가01",false));
		seats.add(new Seat("3","복도01",false));
		seats.add(new Seat("3","창가02",false));
		seats.add(new Seat("3","복도02",false));
		
		trains.add(new Train("B","부산역","07:00","서울역","14:15",stopstations,seats));
		
		
		//Train C
		
		stopstations.add(new StopStation("부산역","","08:00"));
		stopstations.add(new StopStation("서울역","15:15",""));
		
		seats.add(new Seat("1","창가01",false));
		seats.add(new Seat("1","복도01",false));
		seats.add(new Seat("1","창가02",false));
		seats.add(new Seat("1","복도02",false));
		seats.add(new Seat("2","창가01",false));
		seats.add(new Seat("2","복도01",false));
		seats.add(new Seat("2","창가02",false));
		seats.add(new Seat("2","복도02",false));
		seats.add(new Seat("3","창가01",false));
		seats.add(new Seat("3","복도01",false));
		seats.add(new Seat("3","창가02",false));
		seats.add(new Seat("3","복도02",false));
		
		trains.add(new Train("C","부산역","08:00","서울역","15:15",stopstations,seats));
		
		
		//Train D
		
		stopstations.add(new StopStation("부산역","","09:00"));
		stopstations.add(new StopStation("밀양역","10:00","10:15"));
		stopstations.add(new StopStation("김천역","12:30","12:45"));
		stopstations.add(new StopStation("세종역","15:00","15:15"));
		stopstations.add(new StopStation("서울역","16:15",""));
		
		seats.add(new Seat("1","창가01",false));
		seats.add(new Seat("1","복도01",false));
		seats.add(new Seat("1","창가02",false));
		seats.add(new Seat("1","복도02",false));
		seats.add(new Seat("2","창가01",false));
		seats.add(new Seat("2","복도01",false));
		seats.add(new Seat("2","창가02",false));
		seats.add(new Seat("2","복도02",false));
		seats.add(new Seat("3","창가01",false));
		seats.add(new Seat("3","복도01",false));
		seats.add(new Seat("3","창가02",false));
		seats.add(new Seat("3","복도02",false));
		
		trains.add(new Train("D","부산역","09:00","서울역","15:15",stopstations,seats));
		
		
		//Train E
		
		stopstations.add(new StopStation("부산역","","10:00"));
		stopstations.add(new StopStation("김천역","13:30","13:45"));
		stopstations.add(new StopStation("대전역","14:45","15:00"));
		stopstations.add(new StopStation("서울역","17:15",""));
		
		seats.add(new Seat("1","창가01",false));
		seats.add(new Seat("1","복도01",false));
		seats.add(new Seat("1","창가02",false));
		seats.add(new Seat("1","복도02",false));
		seats.add(new Seat("2","창가01",false));
		seats.add(new Seat("2","복도01",false));
		seats.add(new Seat("2","창가02",false));
		seats.add(new Seat("2","복도02",false));
		seats.add(new Seat("3","창가01",false));
		seats.add(new Seat("3","복도01",false));
		seats.add(new Seat("3","창가02",false));
		seats.add(new Seat("3","복도02",false));
		
		trains.add(new Train("E","부산역","10:00","서울역","17:15",stopstations,seats));
		
		//costs 부산역 스타트
		costs.add(new Cost("부산역","서울역",60000));
		costs.add(new Cost("부산역","세종역",40000));
		costs.add(new Cost("부산역","대전역",40000));
		costs.add(new Cost("부산역","김천역",30000));
		costs.add(new Cost("부산역","대구역",20000));
		costs.add(new Cost("부산역","밀약역",10000));
		
		//costs 밀양 스타트
		costs.add(new Cost("밀양역","서울역",50000));
		costs.add(new Cost("밀양역","세종역",40000));
		costs.add(new Cost("밀양역","대전역",30000));
		costs.add(new Cost("밀양역","김천역",20000));
		costs.add(new Cost("밀양역","대구역",10000));
		
		//costs 대구 스타트
		costs.add(new Cost("대구역","서울역",40000));
		costs.add(new Cost("대구역","세종역",30000));
		costs.add(new Cost("대구역","대전역",20000));
		costs.add(new Cost("대구역","김천역",10000));
		
		//costs 김천 스타트
		costs.add(new Cost("김천역","서울역",30000));
		costs.add(new Cost("김천역","세종역",20000));
		costs.add(new Cost("김천역","대전역",10000));
		
		//costs 대전 스타트
		costs.add(new Cost("대전역","서울역",20000));
		costs.add(new Cost("대전역","세종역",10000));
		
		//costs 세종 스타트
		costs.add(new Cost("세종역","서울역",10000));		
		
		
	}


}

