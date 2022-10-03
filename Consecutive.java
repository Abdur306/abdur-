import java.util.*;
public class Consecutive{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;++i)
	a[i]=s.nextInt();
for(int i=2;i<n;++i){
	if(a[i]==0){
		a[i]=a[i-2];
	}
	
System.out.print(a[i]);
}



}
}