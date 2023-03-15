package trainReservation.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import trainReservation.dto.ReservationDto;
import trainReservation.service.ReservationService;

public class ReservationController {
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	private ReservationService reservationService;
	
	
	
	public ReservationController() {
		this.reservationService  = new ReservationService();
		}
	public void reservation() {
		while(true) {
		ReservationDto reservationDto = new ReservationDto(); //if01
		LocalTime departureTime = null;
			if(!reservationDto.getDepartureStation().isBlank() || !reservationDto.getArrivalStation().isBlank() || !reservationDto.getDepartureTime().isBlank() ) {
				System.out.println("모두 입력해 주세요");
				continue;
				}//if01
			
			try {
				departureTime = LocalTime.parse(reservationDto.getDepartureTime(),timeFormatter);
			}
			
			catch(Exception exception) {
				System.out.println("잘못된 시간 기입 입니다. 형식에 맞춰주세요");
				continue;
				
			}
					
		
		
		
		}
	}

}
