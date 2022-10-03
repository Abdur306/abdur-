                                              /*Number count occurance of number to given int arr*/

import java.util.Scanner;

 class CountNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter the elements");
		for(int i=0;i<size;++i) {
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<a.length;++i) 
			for(int j=i+1;j<a.length;++j) 
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		boolean check[]=new boolean[size];
		int count=0;
		for(int i=0;i<size;++i) {
			count=1;
			if(check[i]==true)
				continue;
		
		for(int j=i+1;j<size;++j)
			if(a[i]==a[j]) {
				check[j]=true;
				count++;
			}
		System.out.println(a[i]+"-"+count);
		} } }


 /*boolean s=new boolean[size];int count=0;
  for(int i=0;i<len;++i)
int count=1;
if(s[i]==true)
cntinue;
for(int j=i+1;j<sie;++j)
if(a[i]==a[j])
s[j]=true
count++
*/

		
		
