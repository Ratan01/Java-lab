package Com.Java.School;
import java.util.*;
public class MedalsTally {
	public HashMap<String, String> getStudent(HashMap<String, Integer>st){
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = st.keySet();
		for(String s:set) {
			Integer marks =st.get(s);
			if(marks>=90) {
				medal.put(s,"Gold");
			}
			else if(marks>=80) {
				medal.put(s, "Silver");
			}
			else if(marks>=70) {
				medal.put(s, "Bronze");
			}
		}
		return medal;
	}
	public static void main(String[] args) {
		HashMap<String, Integer> st = new HashMap<>();
		MedalsTally md=new MedalsTally();
		st.put("Raj", 70);
		st.put("Mohan", 98);
		st.put("Shantanu", 50);
		st.put("Ganesh", 89);
		System.out.println(md.getStudent(st));
	}
}
