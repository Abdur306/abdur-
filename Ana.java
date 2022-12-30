import java.util.*;
public class Ana{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
Boolean result=false;
if(s1.length()==s1.length()){
	for(int i=0;i<s1.length();++i){
		for(int j=0;j<s1.length();++j){
			if(s1.charAt(i)==s2.charAt(j)){
				result=true;
				break;//continue;
			}
			else
				result=false;
			
		}
	}
}
if(result==true)
	System.out.println("anagran");
else
	System.out.println("no");
}
}
