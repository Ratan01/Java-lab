package Com.Java1.Module1;

public abstract class WrittenItem extends Item{
	private String author;	
	public WrittenItem(int id, String title, int copies,String author){
		super(id,title,copies);
		this.author=author;
	}
	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", toString()=" + super.toString() + "]";
	}
}