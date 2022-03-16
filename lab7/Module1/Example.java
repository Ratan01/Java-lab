package Com.Java.Module1;
import java.util.function.BiFunction;

public class Example {
	public static void main(String[] args) {
		BiFunction<Double, Double,Double> b = (x,y)->Math.pow(x,y);
		System.out.println(b.apply(4.0, 3.0));
	}
}
