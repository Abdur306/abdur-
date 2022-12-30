import java.util.*;
class Sum{
public static void main(String[] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int sum=0;
for(int i=0;i<n;i++){
	sum+=a[i];
}
System.out.println(sum);

}
}