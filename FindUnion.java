import java.util.Scanner;

class FindUnion {
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
	
	static int findUnion(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				System.out.print(arr1[i++] + " ");
			else if (arr2[j] < arr1[i])
				System.out.print(arr2[j++] + " ");
			else  {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}

		
		while (i < m)
			System.out.print(arr1[i++] + " ");
		while (j < n)
			System.out.print(arr2[j++] + " ");

		return 0;
	}

	
}
