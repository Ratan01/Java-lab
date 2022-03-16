package Com.Java.Module1;
import java.util.Scanner;
public class CheckSalary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your salary");
		int a= sc.nextInt();
		sc.close();
		try {
			if(a<3000) {
				throw new EmployeeException("your Salary is below than 3000 .");
			}
			else {
				System.out.println("eligible for card ");
			}
		}
		catch(EmployeeException ee) {
			System.out.println(ee);
		}

		finally {
			System.out.println("above 3000 than u r eligible for card");
		}
	}
}
