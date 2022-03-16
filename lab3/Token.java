import java.util.*;
public class Token {
	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer in a Line: ");
		String s = sc.nextLine();
		StringTokenizer t = new StringTokenizer(s, " ");
		while (t.hasMoreTokens()) {
			String temp= t.nextToken();
			n=Integer.parseInt(temp);
			System.out.println(n);
			sum=sum+n;
		}
		System.out.println("sum of the integer is: "+sum);
		sc.close();
	}
}
