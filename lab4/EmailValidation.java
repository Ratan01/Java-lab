import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the e-mail ID: ");
		String email=sc.nextLine();
		boolean b= validation(email);
		System.out.println(b);
		sc.close();
	}
	public static boolean validation(String email) {
		String r="^[A-Za-z0-9+_.-]+@?[a-zA-Z0-9.com]+$";
		Pattern p= Pattern.compile(r);
		if(email==null) {
			return false;
		}
		Matcher m=p.matcher(email);
		return m.matches();
	}
}
