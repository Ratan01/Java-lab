package Com.Java.Reverse;
import java.util.*;
public class ReverseCount {
	public static Integer[] getSorted(TreeSet<Integer> arr)
	{
		int size = arr.size();
		Integer a[] = new Integer[size];
		a = arr.toArray(a);		
		for(int i=0; i<size; i++)
		{
			String val = String.valueOf(a[i]);
			String rev_val = new StringBuilder(val).reverse().toString();
			a[i] = Integer.parseInt(rev_val);
		}	
		Arrays.sort(a);
		return a;
	}	
	public static void main(String[] args) {	
		TreeSet<Integer> arr = new TreeSet<>();
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();	
		System.out.println("Enter the element: ");
		for(int i=0; i<n; i++)
		{
			int number = sc.nextInt();
			arr.add(number);
		}
		int size = arr.size();
		Integer result_arr[] = getSorted(arr);	
		System.out.println("Array after Revrsing the number and Soretd are as follows: ");
		for(int i: result_arr)
			System.out.print(i + "  ");
	}
}
