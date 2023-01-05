package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBoooking {

public static void main(String [] abu){

Reservation res=new Reservation();
res.MainReserve();

}
}

class Reservation{
static Scanner s2=new Scanner(System.in);
	// Details bus[]=new Details[10];
	 String Seater[][]=new String[6][2];
	  String Sleeper[][]=new String[3][2];
	   int seat=6;
		 int col=2;
	    int sleep=3;
	 int tseat=seat*col;
	 int tsleep=sleep*col;
	 int ks=0;
	 int kslp=0;
	ArrayList<Details>arr=new ArrayList<>();
	
	public void MainReserve(){
	System.out.println("1.Starting || 2.Book || 3.Cancel || 4.Availabilites || 5.Show Tickets");	
		int input=s2.nextInt();
		switch(input){
			
			case 1:
			      Available();
				  break;
			case 2:
			     Book();
			     break;
			case 3:
			    Cancel();
				break;
			case 4:
			    Display1();
				break;
			case 5:
				ShowTicks();
				break;
			
		}
	}
	public void Available(){
		int inc=1;
		System.out.println("seat:"+tseat);
			System.out.println("sleep:"+tsleep);
		System.out.println("Available Seater Seats");
		for(int i=0;i<6;i++){
			for(int j=0;j<2;j++){
				Seater[i][j]=String.valueOf(inc++);	
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}inc=1;
		System.out.println("Available Sleepers berth");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				Sleeper[i][j]=String.valueOf(inc++)+"U";	
     System.out.print(Sleeper[i][j]+" ");				
			}
			System.out.println();
		}
		MainReserve();
	}
	protected void Book(){
		
		System.out.println("Enter name ");
		String cname=s2.next();
		System.out.println("Enter age ");
		int cage=s2.nextInt();
		System.out.println("Enter gender ");
		String cgender=s2.next();
		System.out.println("Enter phone number ");
		String cnum=s2.next();
		System.out.println("Enter mialid ");
		String cmail=s2.next();
		System.out.println("Enter Pickup ");
		String cpickup=s2.next();
		System.out.println("Enter Drop ");
		String cdrop=s2.next();
		System.out.println("1.Seater || 2. Sleeper");
		int bok=s2.nextInt();
		if(bok==1){
			//int tseat=seat*col;
			if(tseat>0){
				System.out.println("Available:"+tseat);
				System.out.println("Enter Seat No");
				String seat_sno=s2.next();
				boolean result=true;
				for(int i=0;i<6;i++){
				for(int j=0;j<2;j++){
				//	System.out.println(Seater[i][j]);
				if(String.valueOf(seat_sno).equals(Seater[i][j])){
				System.out.println("Seater Ticket Booked success");
                 Seater[i][j]=" ";
				 arr.add(ks++,new Details(cname,cage,cgender,cnum,cmail,cpickup,cdrop,seat_sno));
			    result=false;
				 tseat--;
				 break;
				}
				}
				}
			  if(result){
              System.out.println("Re-Enter valid Seat No");
			  Book();
				}
	//			System.out.println(deepToString(Seater));
           MainReserve();				
			}
			else{
				System.out.println("Currently no tickets ");
			}
			
		}
		if(bok==2){
			//int tseat=seat*col;
			if(tsleep>0){
				System.out.println("Available:"+tsleep);
				System.out.println("Enter Seat No");
				String seat_sno=s2.next();
				boolean result=true;
				for(int i=0;i<3;i++){
				for(int j=0;j<2;j++){
				//	System.out.println(Seater[i][j]);
				if(String.valueOf(seat_sno).equals(Sleeper[i][j])){
				System.out.println("Seater Ticket Booked success");
                 Sleeper[i][j]=" ";
				 arr.add(kslp++,new Details(cname,cage,cgender,cnum,cmail,cpickup,cdrop,seat_sno));
				 
			    result=false;
				 tsleep--;
				 break;
				}
				}
				}
			  if(result){
              System.out.println("Re-Enter valid Seat No");
			  Book();
				}
	//			System.out.println(deepToString(Seater));
           MainReserve();				
			}
			else{
				System.out.println("Currently no tickets ");
			}
			
		}
	}
	private void ShowTicks() {
		
		
	}
	public  void Display1(){
		System.out.println("Seater Seats");
		for(int i=0;i<6;i++){
			for(int j=0;j<2;j++){
				
				System.out.print(Seater[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sleeper Seats");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				
				System.out.print(Sleeper[i][j]+" ");
			}
			System.out.println();
		}
		MainReserve();
	}
	public void  Cancel(){
		System.out.println("1.Seater || 2.Sleeper");
		int cin=s2.nextInt();
		if(cin==1) {
		System.out.println("Enter the SeatNo to Cancel");
		String cseat_no=s2.next();
		for(int i=0;i<6;i++){
			for(int j=0;j<2;j++){
				if(String.valueOf(cseat_no).equals(Seater[i][j])){
					System.out.println("Seater Ticket Cancelled success");
	                 Seater[i][j]=cseat_no;
				}
			}
				System.out.println();
		}MainReserve();
		}
		if(cin==2) {
			System.out.println("Enter the SleeperNo to Cancel");
			String cseat_no=s2.next();
			for(int i=0;i<3;i++){
				for(int j=0;j<2;j++){
					if(String.valueOf(cseat_no).equals(Sleeper[i][j])){
						System.out.println("Sleeper Ticket Cancelled success");
		                 Sleeper[i][j]=cseat_no;
					}
				}
	     		System.out.println();
			}	
		}MainReserve();
	}
}
class Details{
	String name;
	int age;
	String gender;
	String phone;
	String mailid;
	String pickup;
	String drop;
	String seatno;
public Details(String name,int age,String gender,String phone,String mailid,String pickup,String drop,String seatno){
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.phone=phone;
	 this.mailid=mailid;
	 this.pickup=pickup;
	 this.drop=drop;
	 this.seatno=seatno;
}
public String toString(){
	return name+" "+age+" "+gender+" "+phone+" "+mailid+" "+pickup+" "+drop+" "+seatno;
}
}

