import java.util.*;
class MinMax{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n;
n=s.nextInt();
int a[]=new int[10];
System.out.println("enter the arrays");

for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int max=a[0];
int min=a[0];
int i=1;
while(i<n-1){    //for(int i=0;i<n;i++){                        /* while(con){ initialize,inc} */

if(a[i]<min)
min=a[i];
i++;
if(a[i]>max)
max=a[i];


}
System.out.println("minimum value is"+" "+min+" "+"maximum value is"+" "+max);




}
}