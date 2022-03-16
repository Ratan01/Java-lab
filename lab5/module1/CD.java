package Com.Java1.Module1;

public class CD extends MediaItem{
	private String artist;
	private String genre;	
	public CD(int identificationNumber, String title, int Copies, int runtime, String artist, String genre) {
		super(identificationNumber, title, Copies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", toString()=" + super.toString() + "]";
	}
}
