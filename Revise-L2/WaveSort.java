import java.util.*;
class WaveSort{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int temp=0;
for(int i=0;i<n-1;i+=2){
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
	
}
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
}
}