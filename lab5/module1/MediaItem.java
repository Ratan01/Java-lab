package Com.Java1.Module1;

public abstract class MediaItem extends Item{
	private int runtime;	
	public MediaItem() {
		super();
	}
	public MediaItem(int id, String title, int copies,int runtime) {
		super(id, title, copies);
		this.runtime=runtime;
	}
	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", toString()=" + super.toString()  +"]";
	}
}