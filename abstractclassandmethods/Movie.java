package abstractclassandmethods;

import java.util.ArrayList;

abstract class Movie {
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
		this.rating = rating % 5;
	}
	abstract public String getGenre();
	abstract public int getRecommendedAge();
	@Override
	public String toString() {
		return "Movie name=" + name + "\nreleaseYear=" + releaseYear + "\ndirector=" + director + "\nproducer="
				+ producer + "\nactors=" + actors + "\nrating=" + rating + "\n";
	}
}

