import java.util.*;
public class SubArray{
public static void main(String [] args){
Scanner s=new Scanner(System.in);

int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];

int k=1,m=n;
System.out.println("enter 1st array elements");
for(int i=0;i<n;++i){
	a[i]=s.nextInt();
}
System.out.println("enter 2nd array elements");
for(int j=0;j<n;++j){
	b[j]=s.nextInt();
}
for(int i=0;i<m;++i){	
for(int l=m;l>=k;l--){
	a[l+1]=a[l];
}
a[k]=b[i];
k=k+2;
m++;
}
}
}