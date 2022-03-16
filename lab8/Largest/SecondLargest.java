package Com.Java.Largest;
import java.util.*;

public class SecondLargest {
	public static int getSecondSmallest(Integer[] arr){ 
		
		List<Integer> list=Arrays.asList(arr);  
		Collections.sort(list);  
		int element=list.get(1);  
		return element;  
	}  
	public static void main(String args[]){  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondSmallest(b));  
	}
}
