import java.time.LocalDate;
import java.util.*;
import java.time.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date (DD): ");
		int d=sc.nextInt();
		System.out.println("Enter the month (MM): ");
		int m=sc.nextInt();
		System.out.println("Enter the year (YYYY): ");
		int y=sc.nextInt();
		LocalDate bday = LocalDate.of(y,m,d); ///01, Month.May, 2004
		LocalDate today = LocalDate.now();
		Period age = Period.between(bday, today);
		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();
		System.out.println("number of years: " + years);
		System.out.println("number of months: " + months);
		System.out.println("number of days: " +days);
		sc.close();
	}
}