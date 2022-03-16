package Com.Java.Squares;
import java.util.*;
public class Squares {
	public static HashMap<Integer, Integer> getSquares(int[] arr)
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int a:arr)
		{
			map.put(a, a*a);
		}
		return map;
	}
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		HashMap<Integer,Integer> map=getSquares(arr);
		Iterator<Integer> t=map.keySet().iterator();
		while(t.hasNext()) {
			Integer k=t.next();
			System.out.println(k+":"+map.get(k));
		}
	}
}
