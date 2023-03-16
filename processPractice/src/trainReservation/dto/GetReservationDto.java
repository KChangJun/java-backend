package trainReservation.dto;

import java.util.Scanner;

public class GetReservationDto {

	private String reservationNumber;
	
	
	// constructor
	public GetReservationDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("예약 번호 : ");
		this.reservationNumber = scanner.nextLine();
	}

	public GetReservationDto(String reservationNumber) {
		super();
		this.reservationNumber = reservationNumber;
	}
	//-------------------------------------------------------------------
	
	// getter setter 
	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	//---------------------------------------------------------------------
	
	
	// toString
	
	@Override
	public String toString() {
		return "GetReservationDto [reservationNumber=" + reservationNumber + "]";
	}
	//----------------------------------------------------------------


	
}
