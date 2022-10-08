import java.util.*;
public class Rbooking{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n;//=s.nextInt();
do{
System.out.println("1.Bookings | 2.Cancelation | 3.Chat | 4.Exist");
 n=s.nextInt();
switch(n){
	case 1:
	     System.out.println("Enter  passenger name,age,birth preference");
		 
		 break;
	case 2:
         System.out.println("enter the passenger id");

         break;
    case 3:
	    System.out.println("chat prepared");
		
		break;
		
	case 4:
	     System.out.println("thank you visit again");
}
}while(n!=4);
}
}
public class Passenger{
	int id=1;
	String name;
	int age;
	String birth preference;
	String alloted;
	int number;
	public Passenger(String name,int age,String birth preference){
	this.name=name;
	this.age=age;
	this.birth preference=birth preference;
	this.id=id++;
	alloted="";
	number=-1;
	
	}
}
class Tickets{
	 final int lower_birth[2];
	 final int meddile_birth[2];
	 final int upper_birth[2];
   	 final int rac[2];
	 final int w_list[2];
	
	public static void Bookings(){
		
	}
	
}
class Cancel{
	
}