import java.util.*;
class BinarySearch{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int last=a.length-1;
int key=s.nextInt();
Bin(a,0,last,key);
}
public static void Bin(int a[],int st,int end,int key){
	int mid=(st+end)/2;
	while(st<=end){
	if(a[mid]<key){
		st=mid+1;
	}
	else if(a[mid]==key){
		System.out.println("index found "+mid);
	     break;
	}
	else{
		end=mid-1;
	}
	mid=(st+end)/2;
}
if(st>end)
System.out.println("not found");
}
}