import java.util.*;
public class Rotate{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int i,j,low,n,r;
System.out.println("enter the size");
n=s.nextInt();
int a[]=new int[n];
for( i=0;i<n;++i)
	a[i]=s.nextInt();
System.out.println("enter count");
r=s.nextInt();
for( i=0;i<r;++i){
	low=a[n-1];	
	for(j=n-1;j>0;j--){
		a[j]=a[j-1];	
	}
	a[0]=low;
}
System.out.println("rotation array");
String sa=Arrays.toString(a);
System.out.println("Array"+sa);
}
}