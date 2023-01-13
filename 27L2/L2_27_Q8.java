import java.util.*;
class L2_27_Q8{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
boolean result=true;
for(int i=0,j=str.length()-1;i<str.length()-1&&j>=0;){
	
	if(str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z' ){
		if(str.charAt(j)>='A'&&str.charAt(j)<='Z'||str.charAt(j)>='a'&&str.charAt(j)<='z'){
			if(str.charAt(i)==str.charAt(j)){
		   i++;
	       j--;
		}
		else{
			result=false;
			break;
		}
		}
		else
			j--;
		}
		else
			i++; 
}

if(result)
	System.out.println("Its a palindrome");
	else
	System.out.println("Its not  a palindrome");
}
}