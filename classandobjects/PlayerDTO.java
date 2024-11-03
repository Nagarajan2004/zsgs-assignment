package classesandobjects;

public class PlayerDTO {
	private final String name;
	private String position;
	private int jerseyNumber;
	
	public PlayerDTO(String name, String position, int jerseyNumber) {
		this.name = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
}
