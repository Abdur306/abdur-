import java.util.*;
class L2_27_Q9{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n-1;i++){
	
if(a[i]==a[i+1]){
a[i]+=a[i+1];
a[i+1]=0;
  }				
}
int b[]=new int[n];
int k=0;
for(int i=0;i<=n-1;i++){
	if(a[i]>0)
	b[k++]=a[i];
}
for(int i=0;i<=n-1;i++)
 System.out.print(b[i]+" ");

}
}
