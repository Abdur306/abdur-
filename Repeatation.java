import java.util.*;
class Repeatation{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String name=s.nextLine();
System.out.println("enter the n to repeat that string");
int n=s.nextInt();
for(int i=0;i<n;i++)
System.out.println(name);

}
}