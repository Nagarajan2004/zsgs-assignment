package classesandobjects;

import java.util.List;

public class TeamDTO {
	private String name;
	private String city;
	private String division;
	private List<PlayerDTO> players;
	
	public TeamDTO(String name, String city, String division, List<PlayerDTO> players) {
		super();
		this.name = name;
		this.city = city;
		this.division = division;
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public List<PlayerDTO> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerDTO> players) {
		this.players = players;
	}
	
}
