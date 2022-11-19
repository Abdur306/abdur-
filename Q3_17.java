import java.util.*;
class Q3_17{
public static void main(String [] abu){
Scanner s=new Scanner (System.in);
int n=s.nextInt();
int arr[]=new int[n];
int sum=s.nextInt();
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		for(int k=i+2;k<n;k++){
			if(a[i]+a[j]+a[k]==sum){
				System.out.println(a[i]+a[j]+a[k]);
			}
		}
	}
}
}
}