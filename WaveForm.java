                  // Java implementation of naive method for sorting an array in wave form.
import java.util.*;

class WaveForm
{
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

