import java.util.*;
public class Login{
Scanner s=new Scanner(System.in);
public static void main(String [] args){



}
}
class Admin extends Login{
       Scanner s1=new Scanner();
       String bookname[]=new String[50];
          int bookprice[]=new int[50];
          int bookstock[]=new int[50];
		  System.out.println("enter 1.view | 2.add | 3.update | 4.delete");
          int n=s1.nextInt();	
switch(n){
case 1:
  System.out.println("view");
  
  break;
case 2:
System.out.println("add");

break;
case 3:
System.out.println("update");

break;
case 4:
System.out.println("delete");

break;
default:
System.out.println("re-enter the valid number");
break;


}		  
		  
public void view(){

for(int i=0;i<=3;++i){

System.out.println(bookname[i]);
System.out.println(bookprice[i]);
System.out.println(bookstock[i];

}
}
public void add(){
System.out.println("no.of.books");

}
public void update(){

}
public void delete(){


}

}
class User extends Login{
Scanner s1=new Scanner();
public void view(){

}
public void buy(){


}
public void read(){

}

}