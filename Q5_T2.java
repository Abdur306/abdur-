import java.util.*;
class Q5_T2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char []y=str.toCharArray();
	int size=y.length;
	boolean flag=false;
	for(int i=0;i<size/2;i++){
		for(int j=size-1;j>size/2;j--){
		if(y[i+1]-y[i]==(-1)*(y[j-1]-y[j])){
           flag=true;
	       
		}
		else{
			flag=false;
			break;
		}
		
		}
	}
	if(flag==true)
	{
		System.out.println("ture");
	}
	else
		System.out.println("false");
}
}