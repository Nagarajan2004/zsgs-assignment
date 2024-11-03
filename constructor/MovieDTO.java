package classesandobjects;

import java.util.ArrayList;
import java.util.List;

class Movie {
	private final String name;
	private final int releaseYear;
	private final String director;
    private final String producer;
    private ArrayList<String> actors;
	private float rating;
	
	public Movie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
		this.producer = producer;
		this.actors = actors;
		this.rating = rating%5;
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

	@Override
	public String toString() {
		return "Movie [name=" + name + ", releaseYear=" + releaseYear + ", director=" + director + ", producer="
				+ producer + ", actors=" + actors + ", rating=" + rating + "]\n";
	}
}

public class MovieDTO{
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(
				"Iron Man", 2008, "Jon Favreau", "Kevin Feige", 
				new ArrayList<>(List.of("Robert Downey Jr","Gwyneth Paltrow", "Jeff Bridges","Terrence Howard")),
				5
				));
		movies.add(new Movie(
                "The Dark Knight", 2008, "Christopher Nolan", "Emma Thomas",
                new ArrayList<>(List.of("Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine")),
                5
        ));
        movies.add(new Movie(
                "Inception", 2010, "Christopher Nolan", "Emma Thomas",
                new ArrayList<>(List.of("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page", "Tom Hardy")),
                5
        ));
        
        System.out.println(movies);
	}
}