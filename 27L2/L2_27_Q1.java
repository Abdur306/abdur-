import java.util.*;
class  L2_27_Q1{
public static void main(String [] abu){
	Scanner s=new Scanner(System.in);
System.out.println("enter the string");	
	String str=s.nextLine();
	//str.replace(" ","");
	
		int a[]=new int[26];
		for(int i=0;i<str.length();i++){
	if(str.charAt(i)>='A'  && str.charAt(i)<='Z')
	a[str.charAt(i)-'A']=1;

	else if(str.charAt(i)>='a' && str.charAt(i)<='z')
	  a[str.charAt(i)-'a']=1;
	else
	continue;
}      
int flag=0;
	for(int i=0;i<26;i++){
		if(a[i]!=1){
			flag=1;
			System.out.println("false");
			break;
		}
		
	}
if(flag==0)
	System.out.println("true");
	}
	}
