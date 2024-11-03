package classesandobjects;

public class FlightDTO {
	private final int flightNumber;
	private String origin;
	private String destination;
	private String departedTime;
	private String arrivelTime;
	private final String airline;
	
	public FlightDTO(int flightNumber, String origin, String destination, String departedTime, String arrivelTime,
			String airline) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departedTime = departedTime;
		this.arrivelTime = arrivelTime;
		this.airline = airline;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartedTime() {
		return departedTime;
	}

	public void setDepartedTime(String departedTime) {
		this.departedTime = departedTime;
	}

	public String getArrivelTime() {
		return arrivelTime;
	}

	public void setArrivelTime(String arrivelTime) {
		this.arrivelTime = arrivelTime;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public String getAirline() {
		return airline;
	}
	
}
