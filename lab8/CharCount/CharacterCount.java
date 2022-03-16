package Com.Java.CharCount;
import java.util.*;
public class CharacterCount {
	public static void countsChar(String s) {
		HashMap<Character, Integer> count = new HashMap<>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(count.containsKey(c))
				count.put(c,  count.get(c)+1);
			else
				count.put(c, 1);
		}
		for(Map.Entry entry: count.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.next();
		countsChar(s);
		}
}
