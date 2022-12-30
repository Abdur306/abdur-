import java.util.*;
class RevRec{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String word="";
String rev="";
str+=" ";
System.out.println(revMe(str,word,rev,0));
}
public static String revMe(String str,String rev,String word,int index) {
		if(index==str.length()) {
			return rev;
		}
		char c = str.charAt(index);
		if(c!=32)
		{
			return revMe(str,rev,word+c,index+1);
		}
		else
		{
			return revMe(str,word+" "+rev,"",index+1);
		}
	}
}