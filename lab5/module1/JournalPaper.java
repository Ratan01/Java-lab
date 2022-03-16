package Com.Java1.Module1;

public class JournalPaper extends WrittenItem{
	private int yearPublished;	
	public JournalPaper(int id, String title, int copies,String author, int yearPublished) {
		super(id,title,copies,author);
		this.yearPublished=yearPublished;
	}	
	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", toString()=" + super.toString() + "]";
	}
}