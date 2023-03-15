package trainReservation.entity;

import java.util.List;

public class Train {
	
	
	private String trainNumber; //열차 번호
	private String departureStation; //촐발 역
	private String departureTime; //출발 시간
	private String arrivalStaion; //도착 역
	private String arrivalTime; //도착 시간
	private List<StopStation> stopStaions;
	private List<Seat> seats;
	
	//constructor
	public Train() {}
	public Train(String trainNumber, String departureStation, String departureTime, String arrivalStaion,
			String arrivalTime, List<StopStation> stopStaions, List<Seat> seats) {

		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arrivalStaion = arrivalStaion;
		this.arrivalTime = arrivalTime;
		this.stopStaions = stopStaions;
		this.seats = seats;
	}
	
	//getter setter 
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getDepartureStation() {
		return departureStation;
	}
	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalStaion() {
		return arrivalStaion;
	}
	public void setArrivalStaion(String arrivalStaion) {
		this.arrivalStaion = arrivalStaion;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public List<StopStation> getStopStaions() {
		return stopStaions;
	}
	public void setStopStaions(List<StopStation> stopStaions) {
		this.stopStaions = stopStaions;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	//to string
	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", departureStation=" + departureStation + ", departureTime="
				+ departureTime + ", arrivalStaion=" + arrivalStaion + ", arrivalTime=" + arrivalTime + "]";
	}

	
	
	
	
	
	
	
	
}//class

