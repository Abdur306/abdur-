import java.util.*;
class Delete2{
public static void main(String [] ABU){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int pos=s.nextInt();
for(int i=pos-1;i<n-1;i++){
	a[i]=a[i+1];
}
System.out.println(Arrays.toString(a));

}
}