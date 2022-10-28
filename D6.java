
 /*6.Given two sorted arrays of distinct elements. There is only 1
difference between the arrays. First array has one element extra added in
between. Find the index of the extra element.
Input:
 N = 7
A[] = {2,4,6,8,9,10,12}
B[] = {2,4,6,8,10,12}
Output: 4
 * */
package Dewali;

import java.util.Scanner;
public class D6 {

	public static void main(String[] abu) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of a");
		int m=s.nextInt();
		int a[]=new int[m];
		initailize(a, m);
		System.out.println("enter the size of b");
		int n=s.nextInt();
		int b[]=new int[n];	
		initailize(b, n);
		System.out.println("The missing index is " + findExtra(a, b, m));
		
}
	
	static void initailize(int a[],int size) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter the elements");
	for(int i=0;i<size;++i)
		a[i]=s.nextInt();
	}
	static int findExtra(int a[],int b[],int m) {
		for(int i=0;i<m;++i) {
			if(a[i]!=b[i]) 
			
			return i;
			
		
		}
		return m;
	}
	}

