import java.util.*;
class InOutArray{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();

}
System.out.println(Arrays.toString(a));

}
}