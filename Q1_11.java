import java.util.*;
class Q1_11{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
 a[i]=s.nextInt();
int sum=a[0];
 for(int i=1;i<n;i++){
if(a[i-1]%2==0 && a[i]%2!=0){
	continue;
}
else{
sum+=a[i];
}
}
   
System.out.println(sum);
}
}
