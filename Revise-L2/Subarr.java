import java.util.*;
public class Subarr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("");
int n=s.nextInt();
int flag=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
System.out.println("enter the target");
int target=s.nextInt();
int start=0,end=0;
for(int i=0;i<n;i++){
	int total=a[i];
	start=i;
for(int j=i+1;j<n;j++){
	if(total<target){
	total+=a[j];
	end=j;
	}
	else
break;
}
if(total==target){
	flag=1;
	break;
}
}
if(flag==1)
	for(int i=start;i<=end;i++)
	System.out.println(a[i]);
else
	System.out.println();
}
}