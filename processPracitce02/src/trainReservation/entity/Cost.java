package trainReservation.entity;

public class Cost {
	
	private String departureStation;
	private String arrivalStation;
	private int trainCharge;
	
	//constructor
	public Cost() {}
	
	public Cost(String departureStation, String arrivalStation, int trainCharge) {
		super();
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.trainCharge = trainCharge;
	}

	//getter setter
	public String getDepartureStation() {
		return departureStation;
	}


	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}


	public String getArrivalStation() {
		return arrivalStation;
	}


	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}


	public int getTrainCharge() {
		return trainCharge;
	}


	public void setTrainCharge(int trainCharge) {
		this.trainCharge = trainCharge;
	}

	//tostring
	@Override
	public String toString() {
		return "Cost [departureStation=" + departureStation + ", arrivalStation=" + arrivalStation + ", trainCharge="
				+ trainCharge + "]";
	}
	
	
	
	
	
	
}
