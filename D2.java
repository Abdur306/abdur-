/*
 * Given a sorted array arr[] of distinct integers. Sort the array into
a wave-like array(In Place). In other words, arrange the elements into a
sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexico graphically smallest
one.
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
*/
package Dewali;

import java.util.Scanner;

public class D2 {
	
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			
			int n=s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;++i)
				arr[i]=s.nextInt();
			
			//ob.sortInWave(arr, n);
			for (int i=0; i<n-1; i += 2)
			 swap(arr,i,i+1);
			for (int i : arr)
				System.out.print(i + " ");
		}
		
		static void swap(int arr[], int a, int b)
		{
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
	}