package trainReservation.entity;

public class Seat {
	
	private String roomNumber;
	private String seatPosition;
	private boolean seatStatus;
	
	public Seat() {}
	//constructor
	public Seat(String roomNumber, String seatPosition, boolean seatStatus) {
		super();
		this.roomNumber = roomNumber;
		this.seatPosition = seatPosition;
		this.seatStatus = seatStatus;
	}

	//getter setter 
	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getSeatPosition() {
		return seatPosition;
	}


	public void setSeatPosition(String seatPosition) {
		this.seatPosition = seatPosition;
	}


	public boolean isSeatStatus() {
		return seatStatus;
	}


	public void setSeatStatus(boolean seatStatus) {
		this.seatStatus = seatStatus;
	}

	//to string
	@Override
	public String toString() {
		return "Seat [roomNumber=" + roomNumber + ", seatPosition=" + seatPosition + ", seatStatus=" + seatStatus + "]";
	}
	
	
	
	
	
	
	
	
	
}
