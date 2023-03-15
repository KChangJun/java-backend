package trainReservation.entity;

public class StopStation {

		private String stationName; //정차 역 이름
		private String arrivalTime; //정차 역에 도착
		private String departureTime; //정차 역에서 출발
			
		//constructor
		public StopStation() {}
		public StopStation(String stationName, String arrivalTime, String departureTime) {
			super();
			this.stationName = stationName;
			this.arrivalTime = arrivalTime;
			this.departureTime = departureTime;
		}
		
		//getter setter

		public String getStationName() {
			return stationName;
		}


		public void setStationName(String stationName) {
			this.stationName = stationName;
		}


		public String getArrivalTime() {
			return arrivalTime;
		}


		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}


		public String getDepartureTime() {
			return departureTime;
		}


		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}

		//to string
		@Override
		public String toString() {
			return "StopStation [stationName=" + stationName + ", arrivalTime=" + arrivalTime + ", departureTime="
					+ departureTime + "]";
		}
		
		
		
		
	
		
		
	

}
