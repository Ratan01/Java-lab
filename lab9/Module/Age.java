package Com.Java.Module;
import java.util.*;
public class Age {
	public static void main(String[]args){
		Scanner age = new Scanner (System.in);
		System.out.println("Enter your age");
		int a = age.nextInt();
        age.close();
		try{  
			if(a<15){         
				throw new AgeExcep();
			}          
		}
		catch(AgeExcep ex){
			System.out.println("You entered an invalid number" + a);        
		}
		finally{
			System.out.println("Your age is " + a);
		}   
	}
}
