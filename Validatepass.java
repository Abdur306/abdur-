import java.util.*;
import java.util.Scanner;

public class Validatepass {

	public static void main(String[] args) {
		//final int num_upper=2;
		//final int num_lower=2;
		//final int digits=2;
	//final int special=2;
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
		int letterCount=0;
		int specialCount=0;
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("THE USER SHOULD HAVE THE COMBINATION OF UPPER,LOWER,DIGITS,SPECIAL CASES...");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("PLEASE ENTER THE PASSWORD");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int inputlen=input.length();
		for(int i=0;i<inputlen;i++) {
			char ch=input.charAt(i);
			if(input.charAt(i)>=65 && input.charAt(i)<=90) 
				upperCount++;
				
			else if(input.charAt(i)>=97 && input.charAt(i)<=122) 
				lowerCount++;
			
			else if (input.charAt(i)>=48 && input.charAt(i)<=57) 
				digitCount++;
			else if(input.charAt(i)>=33 && input.charAt(i)<=46)
			specialCount++;
				else 
					System.out.println();
			
		
		}
		
		if(upperCount>=2 && lowerCount>=2 && digitCount>=2 && specialCount>=2) 
			 System.out.println("valid password");
		
		
			
		
	       if(upperCount<=2) {
			//System.out.println("the password have didnt have the following");
				System.out.println("uppercase letters missing");
		}
		 else if(lowerCount<=2)
				System.out.println("lowercase letters  are missing");
		 else	if(digitCount<=2)
				System.out.println("digits letters  are missing");
	 else if(specialCount<=2)
			 System.out.println("special letters are missing");
			else
				System.out.println();
		
			}}
