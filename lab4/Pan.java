import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PAN no: ");
		String pan=sc.nextLine();
		Boolean b= validation(pan);
		System.out.println(b);
		sc.close();
	}
	public static boolean validation(String pan) {
		String r="[A-Z]{5}[0-9]{3}[6-9]{1}[A-Z]{1}";
		Pattern p= Pattern.compile(r);
		if(pan==null) {
			return false;
		}
		Matcher m=p.matcher(pan);
		return m.matches();
	}
}
