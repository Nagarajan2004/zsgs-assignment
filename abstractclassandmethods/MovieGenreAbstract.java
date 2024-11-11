package abstractclassandmethods;

import java.util.ArrayList;
import java.util.List;

class RomanticMovie extends Movie{
	private byte age;
	private String genre;
	public RomanticMovie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating, int age, String genre) {
		super(name, releaseYear, director, producer, actors, rating);
		this.age = (byte)age;
		this.genre = genre;
	}

	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public int getRecommendedAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return super.toString()+"RomanticMovie age=" + age + "\ngenre=" + genre + "\n";
	}
	
}

class SciFiMovie extends Movie{
	private byte age;
	private String genre;
	public SciFiMovie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating, int age, String genre) {
		super(name, releaseYear, director, producer, actors, rating);
		this.age = (byte)age;
		this.genre = genre;
	}

	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public int getRecommendedAge() {
		return age;
	}
	@Override
	public String toString() {
		return super.toString()+"RomanticMovie age=" + age + "\ngenre=" + genre + "\n";
	}
	
}

class ThrillerMovie extends Movie{
	private byte age;
	private String genre;
	public ThrillerMovie(String name, int releaseYear, String director, String producer, ArrayList<String> actors,
			float rating, int age, String genre) {
		super(name, releaseYear, director, producer, actors, rating);
		this.age = (byte)age;
		this.genre = genre;
	}
	
	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public int getRecommendedAge() {
		return age;
	}
	@Override
	public String toString() {
		return super.toString()+"RomanticMovie age=" + age + "\ngenre=" + genre + "\n";
	}
	
}

public class MovieGenreAbstract {
	public static void main(String[] args) {
		Movie romanticMovie = new RomanticMovie("your lie in April", 2015, "Kyohei Ishiguro", "Kyohei Ishiguro",
				new ArrayList<>(List.of("", "Joseph Gordon-Levitt", "Ellen Page", "Tom Hardy")),
                5, 13, "Anime");
		Movie scifiMovie = new SciFiMovie("Inception", 2010, "Christopher Nolan", "Emma Thomas",
                new ArrayList<>(List.of("Kousei Arima", "Kaori Miyazono", "Saki Arima")),
                5, 13, "Sci-Fi");
		Movie thrillerMovie = new ThrillerMovie("It", 2017, "Andy Muschitte", "David Katzenberg and Seth Grahame-Smith", 
				new ArrayList<>(List.of("Jaeden Martell", "Sophia Lillis", "Jeremy Ray Taylor")),
                5, 13, "Thriller");
		
		System.out.println(romanticMovie);
		System.out.println(scifiMovie);
		System.out.println(thrillerMovie);
		
	}
}
