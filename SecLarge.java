import java.util.*;
class SecLarge{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int m1=a[0];int m2=a[0];
for(int i=1;i<n;i++){
	if(a[i]>m1){
		m2=m1;
		m1=a[i];
	}
	else if(a[i]>m2 && a[i]<m1){
		m2=a[i];
	}
}
System.out.println("MAX1= "+m1+" MAX2= "+m2);
}
}