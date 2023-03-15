package trainReservation.dto;

import java.util.Scanner;

public class ReservationDto {
	private String departureStation;
	private String arrivalStation;
	private String departureTime;
	private int numberOfPeople;
	
	public ReservationDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출발역을 적어주세요");
		this.departureStation = scanner.nextLine();
		System.out.print("도착역을 적어주세요");
		this.arrivalStation = scanner.nextLine();
		System.out.print("출발 시간을 적어주세요 HH:mm");
		this.departureTime = scanner.nextLine();
		System.out.println("인원 수를 적어주세요");
		this.numberOfPeople=scanner.nextInt();
		scanner.nextLine();
		}
	
	//getter

	public String getDepartureStation() {
		return departureStation;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	
	//tostring
	@Override
	public String toString() {
		return "[출발역은" + departureStation + ", 도착역은" + arrivalStation
				+ ", 출발시간은" + departureTime + ", 예약자 수는" + numberOfPeople + "]";
	}
	

	
	
}
