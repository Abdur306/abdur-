import java.util.*;
class L2_27_Q4{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
	a[i][j]=s.nextInt();	
	}
}
int sum1=0;
int sum2=0;
for(int i=0;i<n;i++){
	for(int j=0;j<=i;j++){
	sum1+=a[i][j];	
	}
}
for(int i=0;i<n;i++){
	for(int j=n-1-i;j<n;j++){
		sum2+=a[i][j];
	}
}if(sum1>sum2)
System.out.println(sum1);
else
	System.out.println(sum2);

}
}