import java.util.*;
class SwapCountQ7{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int count=0;
int a[]=new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;++i){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
int high=i;
for(int j=i+1;j<n;j++){
if(a[j]<a[high])
high=j;
}
if(high>i){
int temp=a[high];
a[high]=a[i];
a[i]=temp;
count++;
}
}
System.out.print("swaps ="+count);
/*for(int i=0;i<n;i++){
System.out.println(a[i]+" ");
}*/
}
}
