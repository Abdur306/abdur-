import java.util.*;
class SubArray{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
 a[i]=s.nextInt();
int count=0;
for(int i=0;i<n;i++){
	int total=0;
	for(int j=i;j<n;j++){
		
		total+=a[j];
	if(total==0)
count++;		
	}
}
System.out.println(count);




}
}