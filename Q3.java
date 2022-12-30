import java.util.*;
public class Q3{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;++i)
	a[i]=s.nextInt();
System.out.println("enter the sum");
int sum=s.nextInt();
for(int i=0;i<n;++i){
	for(int j=i+1;j<n;++j){
		if(a[i]+a[j]==sum || a[i]+a[j]==-sum){
			System.out.println(a[i]+"+"+a[j]+"="+sum);	
		}
}
}
}
}