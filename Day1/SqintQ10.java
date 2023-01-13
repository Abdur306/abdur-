import java.util.*;
class SqintQ10{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the sum");
int c=s.nextInt();
boolean result=false;
for(int i=1;i<c;i++){
  for(int j=1;j<c;j++){
	if((i*i)+(j*j)==c){
		result=true;		
             break;
	}
}
}
if(result == true)
	System.out.println("true");
else
	System.out.println("false");
}
}