package trainReservation.entity;

//좌석
public class Seat {
	
	private int roomNumber;
	private String seatNumber;
	private boolean seatStatus;
	
	public Seat() {}

	public Seat(int roomNumber, String seatNumber, boolean seatStatus) {
	
		this.roomNumber = roomNumber;
		this.seatNumber = seatNumber;
		this.seatStatus = seatStatus;
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public String getSeatNumber() {
		return this.seatNumber;
	}

	public boolean isSeatStatus() {
		return this.seatStatus;
	}
	public void setSeatStatus(boolean seatStatus) {
		this.seatStatus=seatStatus;
	}
	@Override
	public String toString() {
		return "Seat [roomNumber=" + this.roomNumber + ", seatNumber=" + this.seatNumber + ", seatStatus=" + this.seatStatus + "]";
	}


	
	
}
