import java.util.*;

public class SortAlpha {
	public static void main(String[] args) {
		Comparator<Integer> comp = (i,j) -> i<j ? + 1: -1;
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(30);
		list.add(15);
		list.add(10);
		list.add(20);
		Collections.sort(list, comp);
		System.out.println(list);
	}
	
}
