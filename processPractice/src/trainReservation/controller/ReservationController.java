package trainReservation.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
	
	public ReservationController() {
		this.reservationService  = new ReservationService();
	}
	
	public void reservation() {
	while(true) {
		
			
			//내용 기입하고 기입한 내용 확인 
			GetTrainListDto getTrainListDto= new GetTrainListDto();
			
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
			ReservationInfo reservationInfo = null;
			while(true) {//while02
			
				PostReservationDto postReservationDto = new PostReservationDto(getTrainListDto.getNumberOfPeople());
				reservationInfo= reservationService.postReservation(postReservationDto, getTrainListDto);
				if(reservationInfo==null) {
				continue;
			}
				break;
			}//while02
			
			System.out.println(reservationInfo.toString());
		}//while
	}
	
}
