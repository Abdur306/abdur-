import java.util.*;
class ArraySub{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int st=0;
int temp=0;
int en=0;
boolean result=true;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int target=s.nextInt();
for(int i=0;i<n;i++){
	int k=0;
	for(int j=i;j<n;j++){
		k+=a[j];
		if(k==target){
			result=false;
			//System.out.println((i+1)+" "+(j+1));
			break;
		}
		if(result==false)
			break;
	}
}

System.out.println("temp="+temp);
for(int i=st;i<=en;i++)
	System.out.print(a[i]+" ");
}
}
