import java.util.*;
class ContinuousSubArr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int max=a[0];
for(int i=0;i<n;i++){
	int k=0;
	for(int j=0;j<n;j++){
		k+=a[j];
	if(k>max){
		max=k;
			}
	}
}
System.out.println(max);

}
}