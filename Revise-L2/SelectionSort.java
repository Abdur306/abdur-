import java.util.*;
class SelectionSort{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int count=0;
for(int i=0;i<n;i++){
	int index=i;
	for(int j=i+1;j<n;j++){
		if(a[j]<a[index]){
			index=j;
			count++;
		}
	}
	int temp=a[index];
	a[index]=a[i];
	a[i]=temp;
	
}
for(int i=0;i<n;i++)
	System.out.print(a[i]);
System.out.println("count is :"+count);
}
}