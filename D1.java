/*Given an array arr[] of N non-negative integers representing the
height of blocks. If width of each block is 1, compute how much water
can be trapped between the blocks during the rainy season.
Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10

 * */
package Dewali;

import java.util.Scanner;

public class D1 {
	public static void main(String[] abu) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the size");
	  int n=s.nextInt();
	  System.out.println("enter the elements");
	  int a[]=new int[n];     ///{7,4,0,9}
	  for(int i=0;i<n;++i)
		  a[i]=s.nextInt();
	System.out.println(trappingwater(a));
	}

	   static int trappingwater(int[] arr) {
	  int n=arr.length;
	  int left[]=new int [n];
	  int rigth[]=new int[n];
	  left[0]=arr[0];
	  for(int i=1;i<n;++i) {
		  left[i]=Math.max(left[i-1], arr[i]);
	  }
	  rigth[n-1]=arr[n-1];
	  for(int i=n-2;i>=0;i--) {
		  rigth[i]=Math.max(rigth[i+1], arr[i]);
	  }
	  int ans=0;
	  for(int i=0;i<n;++i) {
		  ans+=(Math.min(left[i], rigth[i])-arr[i]);
	  }
			return ans;
		}
	}

