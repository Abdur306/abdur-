import java.util.*;
class MinMax{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int min=a[0];
int max=a[0];
for(int i=1;i<n;i++){
	if(a[i]>max){
		max=a[i];
	}
	else if(a[i]<min){
		min=a[i];
	}
}
System.out.println(" MIN is "+min+"MAX is "+max);

}
}