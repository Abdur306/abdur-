package Dewali;

import java.util.Scanner;

/* Given an array of distinct elements. Find the third largest element
in it. Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be
5 because it is the 3 largest element in the array A.
Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
 * */
public class D7 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] abu) {
		System.out.println("enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		   for(int i=0;i<n;++i)
			   a[i]=s.nextInt();
		   System.out.println(thirLargest(a,n));
		
}

	static int thirLargest(int arr1[],int N) {
		if(arr1.length>3) {
	for(int i=0;i<N;i++) {
		for(int j=i+1;j<N;j++) {
			if(arr1[i]>arr1[j]) {
				int temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
		//System.out.println(a[i]);
		}
	return (arr1[N-3]);
	}
		else
		return -1;
		
	}
	
}

