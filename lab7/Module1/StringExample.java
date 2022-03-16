package Com.Java.Module1;

import java.util.function.Function;

public class StringExample {
	public static void main(String[] args) {
		Function<String, ?> fn=a->((String)a).replaceAll("", " ");
		System.out.println(fn.apply("MeghanaH"));
	}
}
