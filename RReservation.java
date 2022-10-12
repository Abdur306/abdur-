
import java.util.Scanner;

public class RReservation {
	static int lowerb = 2;
	static int middleb = 2;
	static int upperb = 2;
	static int racb = 2;
	static int w_listw = 2;
	static int count=1;
	static int n1=0;
	static String[] Name=new String[15];
	static int[] Age=new int[15];
	static String[] Birth=new String[15];
    static int[] Seatno=new int[15];
    static int[]Fare=new int[15];
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println(
					"\t\n         ..................\n\t *1.Availabilities* \n\t *2.Booking \t  * \n\t *3.Cancelation   * \n\t *4.Chat          * \n\t *5.Exist         *  \n         ..................");

			n = s.nextInt();
			switch (n) {
			case 1:
				System.out.println("Availabilities ");
				RReservation.availability();
				break;

			case 2:

				RReservation.Bookticket();
				break;

			case 3:

				System.out.println("enter the passenger id");
				break;

			case 4:
				System.out.println("chat prepared");
				break;

			case 5:
				System.out.println("thank you visit again");
			}

		} while (n != 5);

	}

	// class TicketsBooker{

	public static void availability() {

		System.out.println(
				"Lower=" + lowerb + "\nMiddle=" + middleb + "\nUpper=" + upperb + "\nrac=" + racb + "\nW/L=" + w_listw);

	}

	public static void Bookticket() {
		Scanner s1 = new Scanner(System.in);
		if (lowerb < 0 && middleb < 0 && upperb < 0 && racb < 0 && w_listw < 0) {
			System.out.println("No Tickets are Available");
			
		}
		else {
		System.out.println("enter how many tickets");
		 n1 = s1.nextInt();	
		if(n1<=10) {
			for(int i=0;i<n1;i++)
			{
		System.out.println("enter the name");
		Name[i]=s1.next();
		System.out.println("enter the age");
		int age=s1.nextInt();
		Age[i]=age;
		if(age>5)
		{
			Seatno[i]=count++;
			Fare[i]=400;
		}
			else
			{
			Seatno[i]=0;
			Fare[i]=200;
			}
			
		System.out.println("enter berth");
		Birth[i]=s1.next();
			
			if(age>=60)
				Birth[i]="Lower";
			if (Birth[i].equals("Lower")) {
				if (lowerb > 0) {
					Birth[i]="Lower"; 
					lowerb--;
				} else if (middleb > 0) {
					Birth[i]="Middle";
					middleb--;
				} else if (upperb > 0) {
					Birth[i] =  "upper";
					upperb--;
				} else if (racb > 0) {
					Birth[i] = "rac";
					racb--;
				} else if (w_listw > 0) {
					Birth[i]= "w/l";
					w_listw--;
				}
			}
		if (Birth[i].equals("Middle")) {
			if (middleb > 0) {
				Birth[i] ="Middle";
				middleb--;
			} else if (upperb > 0) {
				Birth[i] =  "upper";
				upperb--;
			}else if (lowerb > 0) {
				Birth[i] =  "lower";
				lowerb--;
			} else if (racb > 0) {
				Birth[i] =  "racc";
				racb--;
			} else if (w_listw > 0) {
				Birth[i] = "wlc";
				w_listw--;
			}
		}
		if (Birth[i].equals("Upper")) {
			if (upperb > 0) {
				Birth[i] =  "Upper";
				upperb--;
			} else if (middleb > 0) {
				Birth[i] =  "Middle";
				middleb--;
			} else if (lowerb > 0) {
				Birth[i] =  "lower";
				lowerb--;
			} else if (racb > 0) {
				Birth[i] = "rac";
				racb--;
			} else if (w_listw > 0) {
				Birth[i] =  "w/l";
				w_listw--;
			}
			
		}
	
	}
		}
	System.out.println("Booked Successfully");
			}
		
		RReservation.view();
		System.out.println( "Name\t" + "Age\t" +"seat\t"  +"Birth\t"+ "Fare\t");
		for (int k = 0; k < Fare.length; k++) {
			if(Fare[k]!=0)
			System.out.println( Name[k] + "\t" + Age[k] +"\t"+    Seatno[k] + "\t"  +     Birth[k]+" \t" +Fare[k]+"\t");
		}

	}

	

public static void view() {
	System.out.println(" ----------------------\t"+  "        ------------------------\t"+  " -------------------------\t"+  " ----------------\t");
	System.out.println(" Depature Time :- 13:00 \t"+"Boarding jn : mas-chennai \t"+ "Destination jn : teni-Teni \t"+ " Distance = 505km \t");
	System.out.println(" ----------------------\t"+  "        ------------------------\t"+  " -------------------------\t"+  " ----------------\t");
}
}
class Cancel {

}
