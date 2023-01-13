import java.util.*;
class SqSum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
boolean res=true;
for(int i=1;i*i<=n;i++){
for(int j=1;j*j<=n;j++){
if((i*i)+(j*j)==n)
  res=false;	
}
}
if(res)
	System.out.println("False");
else
	System.out.println("True");


}
}