import java.util.*;
class TaxiL3{
public static void main(String [] abu){
Booking book=new Booking();
book.show();

}
}
class Booking{
static Scanner s=new Scanner(System.in);
static int taxi[]={0,0,0,0};
static int customerid[]=new int[6];
static char pt_taxi[]=new char[6];
static char pickup[]=new char[6];
static char drop[]=new char[6];
static int pick_time[]=new int[6];
static int drop_time[]=new int[6];
//static int distance[]=new int[5];
static int Amount[]=new int[6];
static int count;
static int t=0;
static int t1=0;



public static void show(){
System.out.println("1.Book Taxi | 2.Taxi Details | 3.Exit ");
int sh=s.nextInt();
switch(sh){
      case 1:
	       Book_Taxi();
	       break;
		   
	  case 2:
          Taxi_Details(); 
	      break;
	   case 3:
	        System.out.println("welcome! ");
	        break;
}		
}
public static void Book_Taxi(){
	    customerid[t]=t+1;
		System.out.println("Pickup location (a-f)");
		pickup[t]=s.next().charAt(0);
		System.out.println("Drop location(a-f)");
		drop[t]=s.next().charAt(0);
		System.out.println("enter Time");
		pick_time[t]=s.nextInt();
		drop_time[t]=(int)(drop[t]-pickup[t]+pick_time[t]);
		Amount[t]=(int)(((((drop[t]-pickup[t])*15)-5)*10)+100);
		boolean result=true;
		for(int i=0;i<taxi.length;i++){
			if(taxi[i]==0){
				taxi[i]=i+1;
				pt_taxi[i]=(char)taxi[i];
				result=false;
				System.out.println("Taxi-"+i+""+" is Allocated");
				break;
			}
		}
		if(result){
		  System.out.println("No-Taxi is Available");	
		}
		
		System.out.println("\tC_Id"+"\tPickup"+"\tDrop"+"\tPickTime"+"\tDropTime"+"\tBill");
		System.out.print(customerid[t]+"\t"+pickup[t]+"\t"+drop[t]+"\t"+pick_time[t]+"\t"+drop_time[t]+"\t"+Amount[t]+"\n");
		t++;
		show();
}
public static void Taxi_Details(){
	
}

}	









































		
		/*
		boolean result=true;
		for(int i=0;i<taxi.length;i++){
			if(taxi[i]==0){
			taxi[i]=1;
			count=i;
			result=false;
			System.out.println("Taxi- "+count+  "is allocated ");
			}
		}
		if(result){
		System.out.println("No Cabs Available");
         show();		
			
		}*/
		
		//if(result!=true){
		//System.out.println("Taxi- "+count+  "is allocated "+Amount[t]+"\t" +"Estimated fare ");
		//show();
		//}
	
	//public static initailize_taxi(int customerid,char pickup[],char drop[],int time[],int distance[],int Amount[]){		
	//}
//public static void Display(){
	

/*public static int Amt(int km){
	
	 int amt=100+((km-5)*10);
	 amount[t1]=amt;
	 t1++;
	return Amt;
	
}*/
