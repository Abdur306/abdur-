import java.util.*;
class L2_27_Q10{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int target=s.nextInt();
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
	if(a[i]+a[j]==target){
		System.out.println(a[i]+" "+a[j]);
	}
	}
  }
}
}