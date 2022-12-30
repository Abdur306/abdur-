import java.util.*;
public class Pre{
public static void main(String [] args){
Scanner s=new Scanner (System.in);
int n=s.nextInt();
String str[]=new String[n];
for(int i=0;i<n;++i)
	str[i]=s.next();
String ans=str[0];
for(int i=1;i<str.length();++i){
	ans=comit(ans,str[i]);
}
System.out.println(ans);
}
public static void commit(String s,String s1){
	String temp="";
	for(int i=0,j=0;i<n && j<n;++i,++j){
		
		if(s.charAt(i)!=s1.charAt(i)){
			break;
temp+=s.charAt(i);
		}
		return temp;
		
	}
}
