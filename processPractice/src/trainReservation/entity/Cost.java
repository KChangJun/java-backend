package trainReservation.entity;

// 비용 Entity class
public class Cost {
	private String departureStation;
	private String arrivalStaiton;
	private int amount;
	
	public Cost() {}
	public Cost(String departureStation, String arrivalStation, int amount) {
		this.departureStation= departureStation;
		this.arrivalStaiton =arrivalStation;
		this.amount = amount;
		}
	
	public String getDepartureStation() {
		return this.departureStation;
	}
		
	public String getArrivalStaiton() {
		return this.arrivalStaiton;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	@Override
	public String toString() {
		return "Cost [departureStation=" + this.departureStation + ", arrivalStaiton=" + this.arrivalStaiton + ", amount="
				+ this.amount + "]";
	}
	


}
