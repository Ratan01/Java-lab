package Com.Java1.Module1;

public class Main {
	public static void main(String[] args) {

		Book b1=new Book(101, "Learn Java", 5, "Lata Verma");
		b1.addItem();
		JournalPaper jp=new JournalPaper(102, "ABC", 8, "XYZ", 2020);
		jp.addItem();
		Video v=new Video(103, "Java Plugin", 6, 60, "Prudhviraj", "Study Material", 2022);
		v.addItem();
		CD c=new CD(104,"Java Tutorial",10,180,"Code","Study Material");
		c.addItem();
		Item.print();
		b1.checkOut();
		System.out.println(b1);

		b1.checkIn();
		System.out.println(b1);

		/*Item.checkIn();
			Item.print();*/

		/*Item.checkOut();
			Item.print();*/
	}
}
