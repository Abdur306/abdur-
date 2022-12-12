import java.util.*;
 class L3Bank{
 public static void main(String [] abu){
 //Scanner s=new Scanner(System.in);
Bank iob=new Bank();
iob.mainMet();
 }
 }
 class Bank{
	 
	public void mainMet(){ 
 System.out.println("1.initial || 2.add || 3.show || 4.Topup || 5.Exit");
 int in=s.nextInt();
// Bank bk=new Bank();
 switch(in){
	 case 1:
	      Initial();
		  break;
	case 2:
	       Add();
	       break;
	case 3:
	      Display();
	      break;
    case 4:
	     Topup();
		 break;
    case 5:
	      break;
	 
 }
		 
		 
		 
	 }
	static Scanner s=new Scanner(System.in);
	int CusId[]=new int[10];
	String Name[]=new String[10];
	int Accountno[]=new int[10]; 
	int Balance[]=new int[10];
	String Password[]=new String[10];
	String Encrypt[]=new String[10];
	int Giftcard[]=new int[10];
	int Pin[]=new int[10];
	int Wallet[]=new int[10];
	
	
	 int cusid=11;
	 int accno=11011;
	 int amt=10000;
     int t=2;	
	 int g=1;
	
	public void Initial(){
		
	CusId[0]=11;
	Name[0]="Abdur";
	Accountno[0]=11011;
	Balance[0]=amt;
	Password[0]="Ab12U";
	Encrypt[0]="Bc23V";
	
	
	CusId[1]=22;
	Name[1]="Rahman";
	Accountno[1]=22022;
	Balance[1]=amt;
	Password[1]="Rah12@n";
	Encrypt[1]="Lbi23#o";
	System.out.println("CusId\t"+"Name\t"+"AccNo\t"+"Balance\t"+"Passwrod\t");
	for(int i=0;i<2;i++){
		System.out.println(CusId[i]+"\t"+Name[i]+"\t"+Accountno[i]+"\t"+Balance[i]+"\t"+Password[i]+"\t");
		
	}
	mainMet();
	}
	public void Add(){
	CusId[t]=cusid*t;
	System.out.println("Enter name");
    Name[t]=s.next();
    Accountno[t]=accno*t;
	Balance[t]= amt;
	System.out.println("Enter password");
	Password[t]=s.next();
	Giftcard[t]=9876*10+g;
	Pin[t]=999+g;
	t++;g++;
	mainMet();
	}
	public void Display(){
	System.out.println("CusId\t"+"Name\t"+"AccNo\t"+"Balance\t"+"Pass\t"+"Gcard\t"+"Pin\t");
	for(int i=0;i<t;i++){
		System.out.println(CusId[i]+"\t"+Name[i]+"\t"+Accountno[i]+"\t"+Balance[i]+"\t"+Password[i]+"\t  "+Giftcard[i]+"\t  "+Pin[i]);
		
	}
	mainMet();
	}
	public String Encrypt(String str){
		String temp="";
		for(int i=0;i<str.length();i++){
			temp+=(int)str.charAt(i)+1;
		}
		return temp;
		
		}
	public void Topup(){
		System.out.println("enter the Gift card number");
		int Gcar=s.nextInt();
		System.out.println("enter the Pin number");
		int gpin=s.nextInt();
		for(int i=0;i<Giftcard.length;i++){
			if(Gcar==(Giftcard[i]) && gpin==(Pin[i])){
				System.out.println("Successfully logged in");
			}
			else{
				System.out.println("In-valid number");
				System.out.println("Ensure valid number");
				Topup();
			}
			
		}
		
		 mainMet();	
		}
       		
}
		
	 
 
