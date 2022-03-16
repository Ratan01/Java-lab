import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DOB {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the DOB dd-mm-yyyy: ");
		String dob=sc.nextLine();
		boolean b= validation(dob);
		System.out.println(b);
		sc.close();
	}
	public static boolean validation(String dob) {
		String r="(0?[1-9]|[1-2][0-9]|3[0-1])-(0?[1-9]|1[0-2])-(20[2-9][0-9])";
		Pattern p= Pattern.compile(r);
		if(dob==null) {
			return false;
		}
		Matcher m=p.matcher(dob);
		return m.matches();
	}
}
