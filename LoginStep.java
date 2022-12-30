import java.util.*;
class LoginStep{
public static void main(String [] abu){
 

repeat();
}
static void repeat(){
Scanner s=new Scanner(System.in);
	User use=new User();
Admin adm=new Admin();
System.out.println("1.User | 2.Admin");
int n=s.nextInt();
do{
switch(n){
	case 1:
	    use.Signup();
		break;
	case 2:
	     adm.log_in();
		 break;
	
}
}while(n!=3);
}
}

class User{
//static String UserName[]=new String[5];
//static String PassWord[]=new String[5];
 static Scanner s1=new Scanner(System.in);

public static void Signup(){
System.out.println("enter Username");
String u_name=s1.next();
System.out.println("enter Password");
String pass=s1.next();
System.out.println("You signed-up");
Signin(u_name,pass);
}
public static void Signin(String t1,String t2){
	System.out.println("enter Registered Username");
	String str1=s1.next();
	System.out.println("enter Registered Password");
	String str2=s1.next();
	//for(int i=0;i<pass.length();i++){
	if((str1.equals(t1)) && (str2.equals(t2))){
    System.out.println("You login successfull");
	}		
	//}
	LoginStep.repeat();
}
}
class Admin{
	 static Scanner s2=new Scanner(System.in);
	public static void log_in(){
	String user="abdur";
	String pass_ch="abdu";
	String u_str=s2.next();
	String p_str=s2.next();
	//for(int i=0;i<pass_ch.length();i++){
	if(p_str.equals(pass_ch)){
    System.out.println("You login successfull");
	}
//}
}
}