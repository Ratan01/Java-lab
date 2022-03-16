import java.util.*;
public class Book {
	int bookNo;
	String title;
	String author;
	float price;
	public void displayDetails() {
		System.out.println("Book No" +bookNo);
		System.out.println("Title of Book" +title);
		System.out.println("Author name " +author);
		System.out.println("Price of book" +price);
	}
	void getDetails(int a, String b,String c,float d) {
		bookNo=a;
		title=b;
		author=c;
		price=d;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the book number: ");
		int bookNo = sc.nextInt();
		System.out.println("Enter the Title: ");
		String title = sc.nextLine();
		System.out.println("Enter the Author name: ");
		String author = sc.nextLine();
		System.out.println("Enter the Price: ");
		float price = sc.nextFloat();
		Book b = new Book();
		b.displayDetails();
		b.getDetails(bookNo, title, author, price);
		sc.close();
	}
}
