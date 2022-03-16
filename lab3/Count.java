import java.io.*;
import java.util.*;
public class Count {
	public static void main(String args[])throws IOException{
		int nl=1,nw=0, count=0;           
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter String name: ");
		String str=sc.nextLine();
		int n=str.length();
		char ch[]= new char[str.length()];
		for(int i=0;i<n;i++)
		{
			if(str=="\n") {
				nl++;
			}
			else if(str.charAt(i)!=' ') {
				count++;
			}   
			ch[i]=str.charAt(i);
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
				nw++;
		}
		System.out.println("\nNumber of lines : "+nl);
		System.out.println("\nNumber of words : "+nw);
		System.out.println("\nNumber of characters : "+count);
		sc.close();
	}
}
