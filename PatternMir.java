import java.util.*;
public class PatternMir{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the no.of.rows");
int n,count=1;
System.out.println("how many rows?");
n=s.nextInt();
for(int i=0;i<=2*n;i++){
	int colum=i>n?2*n-i:i;
for(int j=0;j<colum;j++){
System.out.print(count+"* ");
count++;
}
//for(int )
System.out.println();
}
}
}

