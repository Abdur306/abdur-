import java.util.*;
class Inelement2{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
System.out.println("how much insert");
int in=s.nextInt();
int n=s.nextInt();
int a[]=new int [in+n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
System.out.println("enter value");
int val=s.nextInt();
System.out.println("enter the pos");
int pos=s.nextInt();
for(int i=n;i>=pos;i--)
	a[i]=a[i-1];
a[pos-1]=val;
System.out.println(Arrays.toString(a));

}
}