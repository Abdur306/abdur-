import java.util.*;
class ReverseStrInt{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the n");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the values");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
for(int i=0;i<a.length/2;++i){
	int temp=a[i];
  a[i]=a[a.length-i-1];
  a[a.length-i-1]=temp;
}

String tem="";
for(int i=0;i<a.length;i++){
	tem+=a[i];
}
System.out.print(tem);


}
}