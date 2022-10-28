/*
 * The hiring team aims to find 3 candidates who are great collectively.
Each candidate has his or her ability expressed as an integer. 3
candidates are great collectively if product of their abilities is
maximum. Given abilities of N candidates in an array arr[], find the
maximum collective ability from the given pool of candidates.
Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}=3561020
Output: 1200
*/
package Dewali;

import java.util.Scanner;

public class D11 {

	public static void main(String[] abu) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;++i) {
			a[i]=s.nextInt();
		}
		System.out.println("The product is "+maxProduct(a, n));
	}
	static int maxProduct(int arr[],int N) {
	for(int i=0;i<N;i++) {
		for(int j=i+1;j<N;++j) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		//System.out.println(arr[i]);
	}
	
	return(arr[N-1]*arr[N-2]*arr[N-3]) ;	
		
	}
}
