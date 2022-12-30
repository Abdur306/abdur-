import java.util.*;
class OneTwoThree{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String word=" ";
String rev=" ";
str+=" ";
for(int i=0;i<str.length();i++){
	char c=str.charAt(i);
	if(c!=32){
		word+=c;
		
	}
	else{
		
		rev=word+rev;
		word=" ";
	}
		
}
System.out.println(rev);
}
}