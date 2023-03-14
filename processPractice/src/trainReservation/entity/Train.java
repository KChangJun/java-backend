package trainReservation.entity;

import java.util.List;

// 기차 정보 Entity class
public class Train {
	
	private String trainNumber; //열차 번호
	private String departureStation; //촐발 역
	private String departureTime; //출발 시간
	private String arrivalStaion; //도착 역
	private String arrivalTime; //도착 시간
	private int takeMinute; //소요 시간 
	private String type; // 열차 종류
	private List<StopStation> stopStaions;
	private List<Seat> seats;
	
	//Constructor
	
	public Train() {}
	public Train(String trainNumber, String departureStation, String departureTime, String arrivalStaion,
			String arrivalTime, int takeMinute, String type, List<StopStation> stopStaions, List<Seat> seats) {
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arrivalStaion = arrivalStaion;
		this.arrivalTime = arrivalTime;
		this.takeMinute = takeMinute;
		this.type = type;
		this.stopStaions = stopStaions;
		this.seats = seats;
	}
	
	//getter 
	public String getTrainNumber() {
		return this.trainNumber;
	}
	public String getDepartureStation() {
		return this.departureStation;
	}
	public String getDepartureTime() {
		return this.departureTime;
	}
	public String getArrivalStaion() {
		return this.arrivalStaion;
	}
	public String getArrivalTime() {
		return this.arrivalTime;
	}
	public int getTakeMinute() {
		return this.takeMinute;
	}
	public String getType() {
		return this.type;
	}
	public List<StopStation> getStopStaions() {
		return this.stopStaions;
	}
	public List<Seat> getSeats() {
		return this.seats;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "Train [trainNumber=" + this.trainNumber + ", departureStation=" + this.departureStation + ", departureTime="
				+ this.departureTime + ", arrivalStaion=" + this.arrivalStaion + ", arrivalTime=" + this.arrivalTime + ", takeMinute="
				+ this.takeMinute + ", type=" + this.type + ", stopStaions=" + this.stopStaions + ", seats=" + this.seats + "]";
	}
	
	
	
	
	// 정차역(class , 역명, 도착시간, 출발시간 )
	// 남아있는 좌석 (class-호차, 좌석번호, 좌석 상태)
	// 비용(class , 출발역, 도착역, 금액)

   
	
	
}
