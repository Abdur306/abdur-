  //Ques no.1-water storage

import java.util.Scanner;

public class TrappingWater {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the size");
  int n=s.nextInt();
  System.out.println("enter the elements");
  int a[]=new int[n];     ///{7,4,0,9}
  for(int i=0;i<n;++i)
	  a[i]=s.nextInt();
System.out.println(  trappingwater(a));
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
