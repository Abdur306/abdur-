import java.util.*;
class Recursion{
public static void main(String [] abu){
	//public int fun(num);
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
System.out.println(fun(num));
System.out.println(fact(num));
}
 static int fun(int num){
	if(num<2)
		return num;
	
	return fun(num-1)+fun(num-2);
	
}
static int fact(int num){
	if(num==0)
		return 1;
	
	return num*fact(num-1);
	
	
}
}

