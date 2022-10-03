import java.util.*;
class Praymid{
public static void main(String [] args){
int n,count=1;
System.out.println("how many rows?");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<=n;i++){
for(int j=0;j<i;j++){
System.out.print(count+" ");
count++;

}
System.out.println();
}

}
}