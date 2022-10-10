package Inc;

import java.util.Scanner;
public class RReservation {
	static int lowerb=2;
	static int middleb=2;
	static int upperb=2;
	static int racb=2;
	static int w_listw=2;

	
	public static void main(String [] args) {
		
				Scanner s=new Scanner(System.in);
				int n;
				do {
				System.out.println("\t\n         ..................\n\t *1.Availabilities* \n\t *2.Booking \t  * \n\t *3.Cancelation   * \n\t *4.Chat          * \n\t *5.Exist         *  \n         ..................");
				 n=s.nextInt();
				switch(n){
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
				
				}while(n!=5);

	}



		//  class TicketsBooker{
			  
			  public  static void availability() {
				 
				  System.out.println("Lower="+lowerb+ "\nMiddle="+middleb + "\nUpper="+upperb + "\nrac="+racb + "\nW/L="+w_listw);
					

			  }
			  
			public  static  void Bookticket(){
				Scanner s1=new Scanner(System.in);
				System.out.println("enter how many tickets");
				int n1=s1.nextInt();
			//	for(int i=0;i<n1;i++) {
				System.out.println("enter the passenger name,age,birth_preference");
					String name[]=new String[20];
					int age[]=new int[20];
					String birth_pos[]=new String[20];
					for(int  i=1;i<=name.length;++i) {
						name[i]=s1.next();
						age[i]=s1.nextInt();
						birth_pos[i]=s1.next();
						if((birth_pos[i].equals("L")&& lowerb>0) ||
						   (birth_pos[i].equals("M")&& middleb>0) ||
						   (birth_pos[i].equals("U")&& upperb>0)) {
							
							if(birth_pos[i].equals("L")) {
								System.out.println(i+"L");
								System.out.println("Ticket booked succesfully");
								lowerb--;
								break;
							}
							else if(birth_pos[i].equals("M")) {
								System.out.println(i+"M");
								System.out.println("Ticket booked succesfully");
								middleb--;
								break;
							}
							else if(birth_pos[i].equals("U")) {
								System.out.println(i+"U");
								System.out.println("Ticket booked succesfully");
								upperb--;
								break;
							}
							else if(birth_pos[i].equals("racb")) {
								System.out.println(i+"racb");
								System.out.println("Ticket booked succesfully");
								racb--;
								break;
							}
						}
					}
				//}
			}
		  
		  }
				class Cancel{
					
				}
	


