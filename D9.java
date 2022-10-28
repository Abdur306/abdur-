/*
 * Given two sorted arrays array1 and array2 of size m and n
respectively. Find the median of the two sorted arrays.
Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
*/
package Dewali;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st arr size");
		int m=s.nextInt();
		int[]a=new int[m];
		System.out.println("enter the 1st elements");
		for(int i=0;i<m;++i)
			a[i]=s.nextInt();
		System.out.println("enter the 2nd arr size");
		int n=s.nextInt();
		int []b=new int[n];
		System.out.println("enter the 2nd elements");
		for(int i=0;i<n;++i)
			b[i]=s.nextInt();
		
		arrangeArray(a, b,m,n);
}
	static void arrangeArray(int x[],int y[],int size1,int size2) {
		int []c=new int[size1+size2];
		int index=0;
		for(int i=0;i<size1;++i,index++) {
			c[index]=x[i]; }
		for(int i=0;i<size2;++i,index++) {
			c[index]=y[i]; }
		for(int i=0;i<c.length-1;++i) {
			for(int j=i+1;j<c.length-1;++j) {
				if(c[i]>c[j]) {
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			
			//System.out.println(c[i]);
		}
		System.out.println(findMid(c,c.length));
	}
	static float findMid(int []c,int size3) {
		if(size3%2!=0) {
		float result=c[size3/2];
		return result;
		}
		else {
			//float result=
			return (float)((c[(int) (size3/2.0)]+c[(int) ((size3-1)/2.0)])/2.0);
		}
		
	}

}
