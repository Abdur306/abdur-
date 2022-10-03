import java.util.*;
class Magical{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String str ="1221121221221121122";
System.out.println("enter the length");
int count=0;
int n=s.nextInt();
for(int i=0;i<n;++i){
if(str.charAt(i)=='1')
count++;
}
System.out.println(count);
}
}