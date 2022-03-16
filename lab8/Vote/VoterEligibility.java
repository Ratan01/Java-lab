package Com.Java.Vote;
import java.util.*;
public class VoterEligibility{
	public static List votersList(HashMap<Integer, Integer>st){
		List<Integer> list = new ArrayList<>();
		Set<Integer> set=st.keySet();
		for(Integer s:set) {
			Integer age=st.get(s);
			if(age>=18) {
				list.add(s);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> x = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of list: ");
		int size=sc.nextInt();
		System.out.println("Enter the id and age (id age) for element: ");
		for(int i=0; i<size; i++) {
			x.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println("the list of eligible candidates: "+votersList(x));
	}
}
