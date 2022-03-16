package Com.Java.Exception;
import java.util.Scanner;
public class ValidName {
	public static void main(String[] args) {
		System.out.println("Enter ur FirstName::");
		Scanner sc = new Scanner(System.in);
		String firstname=sc.nextLine();
		System.out.println("Enter ur LastName::");
		String lastname=sc.nextLine();
		sc.close();
		try {
			if((firstname.isEmpty()==true) || (lastname.length()==0)){
				throw new Name("you can not leave the first name and last name empty");
			}
			else{
				System.out.println("valid name"+" ::"+"--------"+firstname+" "+lastname);
			}
		}
		catch(Name ne) {
			System.out.println(ne);
		}
	}
}

