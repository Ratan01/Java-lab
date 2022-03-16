package Com.Java.MRefrence;

public class Student {
	public static void main(String[] args) {
		StudentInput s=Student::setName;
		s.getName("Rudra");
	}
		public static void setName(String Name) {
			System.out.println(Name);
		}
	
	
}
