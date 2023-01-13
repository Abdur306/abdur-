import java.util.*;
class Day1Q9{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
boolean result=false;
int sum=0;
for(int i=1;i<num;i++){
if(num%i==0)
	sum+=i; 

}
if(sum==num) {
	result=true;
	System.out.println(result);
}
else{
result =false;
System.out.println(result);
}
}
}

 