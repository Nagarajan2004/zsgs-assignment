package classesandobjects;

import java.util.ArrayList;

public class MovieDTO {
	private final String name;
	private final int releaseYear;
	private final String director;
    private final String producer;
    private ArrayList<String> actors;
	private float rating;
	
	public MovieDTO(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
		this.producer = producer;
		this.actors = actors;
		this.rating = rating%10;
	}

	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public String getProducer() {
		return producer;
	}
	
}
