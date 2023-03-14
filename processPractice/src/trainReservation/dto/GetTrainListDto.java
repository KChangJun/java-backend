package trainReservation.dto;

import java.util.Scanner;

// DTO : Data Transfer Object
// 레이어간 데이터를 전송할 때 사용하는 객체
// get, set 다있어야함
public class GetTrainListDto {
	private String departureStation;
	private String arrivalStaion;
	private String departureTime;
	private int numberOfPeople;
	public GetTrainListDto(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("출발역 :");
		this.departureStation = scanner.nextLine();
		System.out.print("도착역 :");
		this.arrivalStaion=scanner.nextLine();
		System.out.print("출발 시간 :");
		this.departureTime= scanner.nextLine();
		System.out.print("인원: ");
		this.numberOfPeople=scanner.nextInt();
	}
		
	public GetTrainListDto(String departureStation, String arrivalStaion, String departureTime, int numberOfPeople) {
	
		this.departureStation = departureStation;
		this.arrivalStaion = arrivalStaion;
		this.departureTime = departureTime;
		this.numberOfPeople = numberOfPeople;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getArrivalStaion() {
		return arrivalStaion;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}

	public void setArrivalStaion(String arrivalStaion) {
		this.arrivalStaion = arrivalStaion;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	@Override
	public String toString() {
		return "GetTrainListDto [departureStation=" + departureStation + ", arrivalStaion=" + arrivalStaion
				+ ", departureTime=" + departureTime + ", numberOfPeople=" + numberOfPeople + "]";
	}
	
	
	public boolean isEmpty() {
		return this.departureStation.isBlank() || this.arrivalStaion.isBlank() || this.departureTime.isBlank();
		
		
	}
	public boolean isEqualStation() {
		
		return this.departureStation.equals(this.arrivalStaion);
		
	}
	
	public boolean isEqualDepartureStation(String station) {
		return this.getDepartureStation().equals(station);
		
	}
	
	public boolean isEqualArrivalStation(String station) {
		return this.arrivalStaion.equals(station);
		
	}
	
	
	
	
}
