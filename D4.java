/*
 *  Union of two arrays can be defined as the common and distinct elements
in the two arrays. Given two sorted arrays of size n and m respectively,
find their union.
Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
*/
package Dewali;

import java.util.Arrays;
import java.util.Scanner;

class D4{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a1 size");
		int m = s.nextInt();
		int arr1[] = new int[m];
    	System.out.println("enter the elements of a1");
		for(int i=0;i<m;++i) {
			arr1[i]=s.nextInt();
		}
		System.out.println("enter the a2 size");
		int n = s.nextInt();
		int arr2[] = new int[n];
		System.out.println("enter the elements of a2");
		for(int i=0;i<n;++i) {
		    arr2[i]=s.nextInt();
		}
//		 int arr1[] = { 1, 2, 4, 5, 6 };
//	        int arr2[] = { 2, 3, 5, 7 };
//	        int m = arr1.length;
//	        int n = arr2.length;
		findUnion(arr1, arr2, m, n);
	}
	
	static void findUnion(int arr1[], int arr2[], int m, int n){
   int []c=new int[m+n];
   int index=0;
   for(int i=0;i<m;++i,index++)
	   c[index]=arr1[i];
   for(int j=0;j<n;j++,index++)
	   c[index]=arr2[j];
   System.out.println(Arrays.toString(c));
   for(int i=0;i<c.length;i++)
   {
	   for(int j=i+1;j<c.length;j++) 
	   {
		   if(c[i]>c[j])
		   {
			 //  int temp=0;
			   int temp=c[i];
			   c[i]=c[j];
			   c[j]=temp;
		   }   
	   }   
   }
   System.out.println(Arrays.toString(c));
   for(int i=0;i<c.length;++i) {
	   for(int j=i+1;j<c.length;++j) {
		   if(c[i]==c[j]) {
			   continue;
		   }
	   }
	   
   }
   System.out.println(Arrays.toString(c));
  
		}
	}
