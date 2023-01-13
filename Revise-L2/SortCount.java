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
for(int j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
	count++;
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}	
}
}
System.out.println("The count is :"+count);


}
}