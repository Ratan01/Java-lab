package Com.Java.Collection.Demo;

import java.util.*;

public class Student {
	ArrayList<String> list = new ArrayList<String>();
	
	public void setName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the no of element to be added: ");
		int n=sc.nextInt();
		System.out.println("Enter the names: ");
		for(int i=0; i<=n; i++) {
			String name=sc.next();	
			list.add(name);
		}
	}
	public boolean searchName(String name) {
		boolean nm=list.contains(name);
		System.out.println(nm);
		return nm;
	}
	public void searchName(int index) {
		String n=list.get(index);
		System.out.println(n);
	}
	public void printNames() {
		for(String t:list)
		    System.out.println(t);
	}
	public void removeName(String Name) {
		list.remove(Name);
		System.out.println(Name+" name removed from the student list");
	}
}
