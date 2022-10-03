import java.util.Scanner;
class Prefix{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of.elements");
int n=sc.nextInt();
String str[]=new String[n];
System.out.println("enter the string");
for(int i=0;i<n;i++)
str[i]=sc.next();
String ans=str[0];
for(int i=1;i<n;++i){
ans=commit(ans,str[i]);
}
System.out.println("the string are : "+ans);

}
public static String commit(String s,String s1){
String temp="";
for(int i=0,j=0;i<s.length()&&j<s1.length();i++,j++)
{
if(s.charAt(i)!=s1.charAt(j))
break;
temp+=s.charAt(i);
}
return temp;
}
}