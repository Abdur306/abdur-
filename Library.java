import java.util.*;
public class Library{
Scanner s=new Scanner(System.in);
public static void main(String [] args){



}
}
class Admin extends Login{
       Scanner s1=new Scanner();
       String bookname[]=new String[50];
          int bookprice[]=new int[50];
          int bookstock[]=new int[50];
		  int count=0;
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
	System.out.println("view details");
	for(int i=0;i<50;i++){
		if(bookname!='0')
			System.out.print(bookname[i]+" "+bookprice[i]+" "+bookstock[i]);
	}


}
}
public void add(){
	System.out.println("enter the number of book");
	int n=s.nextInt();
	for(int i=0;i<n;++i){
		bookname[i]=s.next();
		bookprice[i]=s.nextInt();
		bookstock[i]=s.nextInt();
	}
	
		
	}
	


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