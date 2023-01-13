import java.util.*;
class SubAr{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int sum=s.nextInt();
for(int i=0;i<n;i++){
	int csum=a[i];
	for(int j=i+1;j<=n;j++){
		if(csum==sum){
	     System.out.println("the sum of"+sum+"is="+i+" "+(j-1));
       for(int k=i;k<j;k++){
      System.out.println(a[k]);
	
	   }		   
		}
		if(csum>sum||j==n)
			break;
		csum+=a[j];	
		
	}
}

}
}