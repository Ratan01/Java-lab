import java.util.*;
public class PositiveString
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String strInput = sc.nextLine();
		if(checkIfAlphabaticOrder(strInput))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	static boolean checkIfAlphabaticOrder(String str)
	{
		int size = str.length();
		char[] chArray = new char[size];
		for(int a = 0; a < size; a++)
		{
			chArray[a] = str.charAt(a);
		}
		Arrays.sort(chArray);
		for(int a = 0; a < size; a++)
		{
			if(chArray[a] != str.charAt(a))
			{
				return false;
			}
		}
		return true;
	}
}