import java.util.*;
public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of array: ");
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
	    Arrays.sort(arr);
	    System.out.println("Sorted array: "+Arrays.toString(arr));
	    int r=arr[1];
	    System.out.println("Second Smallest number in array is: "+r);
	    sc.close();
	}
}
