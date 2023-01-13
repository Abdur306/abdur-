import java.util.*;
class oddOccur{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
boolean result[]=new boolean[n];
int b[]=new int[n];
int count=1;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]==a[j]){
a[j]=0;
count++;	
}
}
b[i]=count;
count=1;
}
for(int i=0;i<n;i++)
	if(a[i]>0 && b[i]%2!=0)
	System.out.println(a[i]+" ");
}
}