package trainReservation.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import trainReservation.dto.GetReservationDto;
import trainReservation.dto.GetTrainListDto;
import trainReservation.dto.PostReservationDto;
import trainReservation.entity.ReservationInfo;
import trainReservation.entity.Train;
import trainReservation.service.ReservationService;



// Controller class(계층)
// 사용자(클라이언트)로 부터 입력을 받는 기능을 수행 / 입력 받은 데이터를 검증 하는 기능 / 비즈니스 로직의 결과를 반환하는 역할(비지니스 로직은 여기 아님)/



public class ReservationController {
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	private ReservationService reservationService;
	
	private GetReservationDto getReservationDto;
	private GetTrainListDto getTrainListDto;
	private PostReservationDto postReservationDto;
	
	public ReservationController() {
		this.reservationService  = new ReservationService();
	}
	
	public void reservation() {
	while(true) {
		
			
			//내용 기입하고 기입한 내용 확인 
			getTrainListDto= new GetTrainListDto();
			
			LocalTime departureTime = null;
			if(getTrainListDto.isEmpty()){
				System.out.println("모두 입력하세요");
				continue;
				}
			
			try {
				departureTime = LocalTime.parse(getTrainListDto.getDepartureTime(),timeFormatter);
				
				}
			catch(Exception exception) {
				System.out.println("잘못된 시간입니다");
				continue;
				}
			
			
		
			if(getTrainListDto.getNumberOfPeople()<=0) {
				System.out.println("잘못된 인원 입니다.");
				continue;	
				}
			
			if(getTrainListDto.isEqualStation()) {
				System.out.println("출발역과 도착역이 같습니다.");	
				continue;
				}
			
			
			// 열차 리스트 확인.
			
			List<Train> possibleTrains = reservationService.getPossibleTrainList(getTrainListDto, departureTime);
		
			System.out.println(possibleTrains.toString());
			
			postReservation();
			break;
			
			
		}//while

	} // reservation method 
	
	public void postReservation() {
		
		while(true) {//while02
		
			postReservationDto = new PostReservationDto(getTrainListDto.getNumberOfPeople());
			ReservationInfo reservationInfo = reservationService.postReservation(postReservationDto, getTrainListDto);
			if(reservationInfo==null) {
			continue;
			}
			
			System.out.println(reservationInfo.toString());

			break;
		}//while02
		
	} // poserReservation method end
	
	//----------------------------------------------------------------------------------------------------
	public void getReservationInfo() {
		
		while(true) {
			getReservationDto = new GetReservationDto();
			String reservationNumber = getReservationDto.getReservationNumber();
			if(reservationNumber.isBlank()) {
				System.out.println("예약 번호를 입력해주세요");
				continue;
			}
			
			ReservationInfo reservationInfo = reservationService.getReservation(getReservationDto);//reservationInfo 가 null 값이 오게 될수도 있다. 그러므로 예외 처리를 해주어야 한다.
			if(reservationInfo ==null) {
				System.out.println("해당 예약번호의 예약정보가 없습니다.");
				break; // 에외 사항인데 밑의 내용이 출력되면 안되기 때문에 break를 걸어 놓아야한다. 예외상황에서 if 를 쓸때
			}
			// String message = (reservationInfo == null ? "해당 예양번호의 예약 정보가 없습니다." : reservationInfo.toString());			
			// 3항 연산자를 쓰는 경우에는 전자는 오류 후자는 정상반응이기 때문에 같이 쓰는것은 좋지 않다.
			
			System.out.println(reservationInfo.toString());
			break;
			
			
			
		}//while
		
		
	}//getReservationInfo end
	//------------------------------------------------------------------------------------------------------
	
	
} //class 종료
