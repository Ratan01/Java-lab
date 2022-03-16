package Com.Java1.Module1;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearReleased;
	public Video(int identification_number, String title, int numberOfCopies, int runtime, String director,
			String genre, int yearReleased) {
		super(identification_number, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", toString()="
				+ super.toString() + "]";
	}
}