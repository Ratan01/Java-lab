package Com.Java.Module1;
import java.util.*;
public interface Number {
		void get(int a);
	}
	class A
	{
		void temp(int i)
		{
			i++;
			System.out.println(i*i);
		}
		static void temp1(int i)
		{
			System.out.println(i*i);
		}
		A(int i)
		{
			System.out.println(Math.sqrt(i));
		}
		A()
		{

		}
	}
	public class MethodReferenceDemo {

		public static void main(String[] args) {
			Inf i1=System.out::println;
			i1.get(10);

			A a1=new A();
			Inf i2=a1::temp;
			i2.get(2);

			Inf i3=A::temp1;
			i3.get(2);

			Inf i4=A::new;
			i4.get(2);

			Consumer c=System.out::println;
			c.accept("Lata");

			Employee e=new Employee();
			e.setEmpId(101);
			e.setEmpName("Lata");

			Supplier s=e::getEmpId;
			System.out.println(s.get());
		}
	}
