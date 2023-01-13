import java.util.*;
class SubSum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int count=0;
int t=s.nextInt();
for(int i=0;i<n;i++){
	int total=0;
	for(int j=i+0;j<n;j++){
		total+=a[j];
		if(total==t)
			count++;
	}
}
for(int i=0;i<n;i++)
System.out.println(a[i]);

}
}