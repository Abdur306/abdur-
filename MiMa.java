import java.util.*;
public class MiMa{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;++i)
	a[i]=s.nextInt();
int min=a[0];
int max=a[0];
int i=0;
while(i<n-1){
if(a[i]<min)
min=a[i];
++i;
if(a[i]>max)
max=a[i];	
}
System.out.println("minimum ="+min+"\n maximum ="+max);
}
}