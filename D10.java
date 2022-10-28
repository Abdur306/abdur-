                     /*Given two arrays A and B contains integers of size N and M, the task 
                       is to find numbers which are present in the first array, but not present
                        in the second array.
                        Input: N = 6, M = 5
                        A[] = {1, 2, 3, 4, 5, 10}
                        B[] = {2, 3, 1, 0, 5}
                        Output: 4 10
                        * */
package Dewali;

import java.util.Arrays;
import java.util.Scanner;

public class D10 {
	public static void main(String[] abu) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;++i)
			a[i]=s.nextInt();
		System.out.println("enter the size");
		int m=s.nextInt();
		int b[]=new int[m];
		System.out.println("enter the elements");
		for(int i=0;i<m;++i)
			b[i]=s.nextInt();
		findmissing(a,b,n,m);
		}
	static void findmissing(int[] a, int[] b, int n, int m ) {
		for(int i=0;i<n;++i) {	
			for(int j=0;j<m;++j) {
				if(a[i]==b[j]) {
					a[i]=0;
				}
					}
		}
		for(int i=0;i<n;++i)
		{
			if(a[i]!=0)
				System.out.print(a[i]+" ");
		}

	}

}
