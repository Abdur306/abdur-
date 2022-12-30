import java.util.*;
class Array{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
int temp;
int count=0;
for(int i=0;i<5;i++)
 a[i]=s.nextInt();
 for(int i=0;i<5-1;i+=2){
 //for(int j=i+1;j<5;j++){
 temp=a[i];
 a[i]=a[i+1];
 a[i+1]=temp;
 count++;
 //}
 }

 System.out.println(Arrays.toString(a));
 System.out.println(count);
}
}