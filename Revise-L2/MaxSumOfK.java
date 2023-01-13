import java.util.*;
class MaxSumOfK{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int k=s.nextInt();
int max=0;
//int total=0;
for(int i=0;i<(n-k+1);i++){
	int total=0;
for(int j=i;j<k+i;j++){
 		total+=a[j];
	max=total>max?total:max;
	}
}
System.out.println(max);


}
}