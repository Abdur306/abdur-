import java.util.*;
class Password{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String uname[]={"abdur","jameel","adhil","anas","suthish"};
String pass[]={"Abu!1","Jam@2","Ad#3","Ana%5","Sut^6"};
String s1=s.next();
String s2=s.next();
for(int i=0;i<uname.length;i++){
if((s1.equals(uname[i]))&&(s2.equals(pass[i])))
{
System.out.println("Successfully logged in");
}
else if((!s1.equals(uname[i]))&&(!s2.equals(pass[i])))
{
continue;
}
else
	System.out.println("invalid");

}
}
}