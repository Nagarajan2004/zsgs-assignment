package methodoverriding;

import java.util.ArrayList;
import java.util.List;

import classesandobjects.Movie;

class RomanticMovie extends Movie{
	public RomanticMovie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating) {
		super(name, releaseYear, director, producer, actors, rating);
	}
	
	public String toString() {
		return "Romantic Movie\n" + super.toString();
	}
}

class SciFiMovie extends Movie{
	public SciFiMovie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating) {
		super(name, releaseYear, director, producer, actors, rating);
	}
	
	public String toString() {
		return "Sci-fi Movie\n" + super.toString();
	}
}

class ThrillerMovie extends Movie{
	public ThrillerMovie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating) {
		super(name, releaseYear, director, producer, actors, rating);
	}
	
	public String toString() {
		return "Thriller Movie\n" + super.toString();
	}
}

public class MovieGenre {
	public static void main(String[] args) {
		Movie romanticMovie = new RomanticMovie("your lie in April", 2015, "Kyohei Ishiguro", "Kyohei Ishiguro",
				new ArrayList<>(List.of("", "Joseph Gordon-Levitt", "Ellen Page", "Tom Hardy")),
                5);
		Movie scifiMovie = new SciFiMovie("Inception", 2010, "Christopher Nolan", "Emma Thomas",
                new ArrayList<>(List.of("Kousei Arima", "Kaori Miyazono", "Saki Arima")),
                5);
		Movie thrillerMovie = new ThrillerMovie("It", 2017, "Andy Muschitte", "David Katzenberg and Seth Grahame-Smith", 
				new ArrayList<>(List.of("Jaeden Martell", "Sophia Lillis", "Jeremy Ray Taylor")),
                5);
		
		System.out.println(romanticMovie);
		System.out.println(scifiMovie);
		System.out.println(thrillerMovie);
		
	}
}
