                                              

import java.util.Scanner;

 class Day1Q5_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter the elements");
		for(int i=0;i<size;++i) {
			a[i]=s.nextInt();
			
		}
		
		boolean check[]=new boolean[size];
		int count=0;
		for(int i=0;i<size;++i) {
			count=1;
			if(check[i]==true)
				continue;
		
		for(int j=i+1;j<size;++j)
			if(a[i]==a[j]) {
				check[j]=true;
				count++;
			}
			if(count%2!=0)
				System.out.println(a[i]+" ");
		} } }




		
		
