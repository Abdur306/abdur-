import java.util.*;
class BankingApplication{
static int custId[]=new int[10];
static int AccountNo[]=new int[10];
static String Name[]=new String[10];
static int Balance[]=new int[10];
static String password[]=new String[10];
static String Encrypt[]=new String[10];
public static void main(String [] abu){
show();
}
public static void show(){
	Scanner s=new Scanner(System.in);
BankCustomer bc=new BankCustomer();
System.out.println("1.Initialize | 2.Add Customer  | 3. Basic Operations | 4.exit");
int n=s.nextInt();
switch( n){
	case 1:
	     bc.initialize();
		  break;
    case 2:
         bc.Add_customer();
          break;
    case 3:
        // bc.Encrypt();
           break;
    
	case 4:
          
		  break;	

}	
}
}

class BankCustomer extends BankingApplication{
static Scanner s=new Scanner(System.in);

int customerid=11;
int accountnum=11011;
static int t=4;
static int ini=0;


public static void initialize(){
		
	custId[0]=11;
	 AccountNo[0]=11011;
	Name[0]="Kumar";
	 Balance[0]=10000;
	password[0]="ApipNbjm";
	
	custId[1]=22;
	 AccountNo[1]=22022;
	Name[1]="Madhu";
	 Balance[1]=20000;
	password[1]="Cboljoh";
	
	custId[2]=33;
	 AccountNo[2]=33033;
	Name[2]="Rahul";
	 Balance[2]=30000;
	password[2]="dbnvt";
	
	custId[3]=44;
	 AccountNo[3]=44044;
	Name[3]="Robin";
	 Balance[3]=40000;
	password[3]="kbwb22";
	System.out.println("custId\t"+"Acc.No\t"+"Name\t"+"Balance\t"+"En_Pwd\t");
	for(int i=0;i<4;i++){
		System.out.println(custId[i]+"\t"+ AccountNo[i]+"\t"+Name[i]+"\t"+ Balance[i]+"\t"+password[i]+"\t");
	}
	BankingApplication.show();
}

public static void Add_customer(){

	custId[t]=custId[t-1]+11;
	 AccountNo[t]= AccountNo[t-1]+11011;
	Name[t]=s.next();
	Balance[t]=10000*(ini+t);
	password[t]=s.next();
    password[t]=Encrypt(password[t]);
	t++;
	ini++;
	System.out.println("custId\t"+"AccountNo\t"+"Name\t"+"Balance\t"+"EncryptedPwd\t");
	for(int i=0;i<t;i++){
		System.out.println(custId[i]+"\t"+AccountNo[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+password[i]+"\t");
	}
	
BankingApplication.show();
}
public static String Encrypt(String str){
	
	String temp="";
	for(int i=0;i<str.length();i++){
		temp+=(int)(str.charAt(i)+1);
	}
	return temp;
    // return Encrypt[];	
	BankingApplication.show();
	}


	
}

	
	
	 

		
		
	
	




