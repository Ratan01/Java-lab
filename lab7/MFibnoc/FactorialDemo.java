package Com.Java.MFibnoc;

public class FactorialDemo{
	public static void main(String[] args) {
		Factorial f = FactorialDemo::fact;
		f.factorial(5);
	}
	public static void fact(int f) {
		int r=1;
		for(int i=f; i>1; i--) {
			r=r*i;
		}
		System.out.println(r);
	}
}
