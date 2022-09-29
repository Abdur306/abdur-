package Inc;
import java.util.*;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		
			char[] y=str.toCharArray();
	
		
		int size=y.length;
		char[] a=new char[size];
		
		int i=0;
		while(i!=size) {
			//if(a[i]>=32 || a[i]<=122) {
				
			a[size-1-i]=y[i];
			i++;
			//continue;
		//}
		
			}
		i=0;
		while(i!=size) {
			
			
			if(a[i]!=y[i]) {
				System.out.println("it is not a palindrome");
			}	
			//else if ( a[i]>=32   && a[i]<=122 ) {
	        	//continue;
			//}
				else  {
					i++;
					continue;
				}
		}
		System.out.println("its a palindrome");

	}

}
