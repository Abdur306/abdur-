import java.util.*;
class GreaterNum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("Enter size");
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
    b[i]=a[i];
}
//System.out.println(Arrays.toString(b));
for(int i=0;i<n;i++){
for(int j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
	int temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
}	
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n-1-i;j++){
if(a[j+1]<a[j]){

System.out.print(a[j+1]+" >"+a[j]);
}	
	
}
}
}
}