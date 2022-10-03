import java.util.*;
public class Iarr{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("spot the array values");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
System.out.println("enter the sum ");
int sum=s.nextInt();
//for(int i=0;i<n;++i){
	int temp=a[1]+a[2]+a[3];
//}
if(temp==sum)
	System.out.println(a[1]"+"a[2]"+"a[3]"="temp);
else
	System.out.println("in-valid");


}
}