import java.util.*;
class Range{
public static void main(String[] args){

 int b[]=new int[10];
int sum=0;

Scanner scan=new Scanner(System.in);
System.out.println("how many n:");
int n=scan.nextInt();

System.out.println("the array elements are : ");
for(int i=0;i<n;i++){
b[i]=scan.nextInt();
}
//int l=a.length;

for( int i=0;i<n;i++){

sum+=b[i];
}
System.out.println("the sum is"+sum);
}
}