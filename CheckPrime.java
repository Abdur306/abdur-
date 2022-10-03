                                                               /*twisted prime number*/

import java.util.Scanner;

class CheckPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	//	PrimeNumber pn=new PrimeNumber();
		
		int n,count=0, rev,n1=0,count1=0;
		System.out.println("enter the number to check:");
		n=s.nextInt();
		for(int i=1;i<=n;++i) {
			if(n%i==0) 
				count++;
			
			}
		if(count==2) {
			//primeNum();
			while(n>0) {
			
				rev=n%10;
				n1=n1*10+rev;
				n=n/10;
				
			}
			
			for(int i=1;i<=n1;++i) {
				if(n1%i==0) 
					count1++;
				
				
			}
			
			if(count1==2) 
				System.out.println(n1+" "+"  Also a Twisted prime number");
				
			
			else 
				System.out.println("it is not a prime number");
				
		}
		else 
			System.out.println("it is not a prime number");
		
		
		}
	}


