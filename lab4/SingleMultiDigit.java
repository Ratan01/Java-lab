import java.util.*;
class SingleMultiDigit {
	static int getSum(int n)
	{
		int sum = 0;

		while (n != 0)
		{
			sum = sum + n % 10;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		int i=Integer.parseInt(s);
		System.out.println(getSum(i));
		sc.close();
	}
}