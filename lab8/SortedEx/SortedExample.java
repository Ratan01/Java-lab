package Com.Java.SortedEx;
import java.util.*;
public class SortedExample {
	static List<Integer> getValues(HashMap<String, Integer> m)
	{
		Collection<Integer> c=m.values();
		ArrayList<Integer> arr = new ArrayList<Integer>(c);
		Collections.sort(arr);
		return arr;
	}
	public static void main (String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("a",56);
		hm.put("b", 98);
		hm.put("c",37);
		hm.put("d", 03);
		System.out.println(SortedExample.getValues(hm));
	}
}

