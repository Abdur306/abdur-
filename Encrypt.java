import java.util.*;
class Encrypt{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
String temp="";
for(int i=0;i<str.length();i++){
	temp+= (char)(str.charAt(i)+1);
	}
	System.out.println(temp);
}
}