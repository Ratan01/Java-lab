package Com.Java.Module1;

import java.util.function.BiPredicate;

public class PassWord {
	public static void main(String[] args) {
		BiPredicate<String, String> f=(ui, pw)->(ui.equals("ratan") && pw.equals("Rk23"));
		System.out.println(f.test("ratan", "Rk23"));
	}
}
