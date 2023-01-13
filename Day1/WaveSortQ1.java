import java.util.*;
class WaveSortQ1{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
int temp;
System.out.println("enter the elements");
for(int i=0;i<n;++i){
	a[i]=s.nextInt();
}
for(int i=0;i<n-1;i+=2){
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
	
		}	
	for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
	}
}
}
