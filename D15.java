/*
 * .Given an array nums containing n distinct numbers in the range [0,
n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
*/
package Dewali;

import java.util.Scanner;

public class D15 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []a=new int[n];
for(int i=0;i<n;++i)
	a[i]=s.nextInt();
    findMissing(a, n);
	}
	static void findMissing(int arr[],int N) {
	for(int i=0;i<N;++i) {
		for(int j=i+1;j<N;++j) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	//System.out.println(arr[i]);
	}
	int max=arr[N-1];
	for(int i=N-1;i>0;--i) {
		if(max==arr[i]) {
			max--;                   //3 4 5 6 
		}
		else {
			System.out.println(max);
		max--;
	}
	}
//	for(int i=0;i<N;++i) {
//		if(arr[i]!=i) {
//	System.out.println(i);
//	break;
//		}
//		else if (arr[i+1]!=i) { 
//			System.out.println(i+1);
//			break;
//		}
	}
	}

//1, 3, 7, 5, 6, 2