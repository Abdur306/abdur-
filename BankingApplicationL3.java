import java.util.*;
class BankingApplicationL3{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);

System.out.println("1.Initialize | 2.Add Customer | 3.Encrypt | 4.Authentication |5. Basic Operations");
int n=s.nextInt();
switch(int n){
	case 1:
	     
		  break;
    case 2:

          break;	
	case 3:
	     
		  break;
    case 4:

          break;
    case 1:
	     
		  break;
 
	}
	
}
}


class BankCustomer{
Scanner s=new Scanner(System.in);
int custId[]=new int[5];
int AccountNo[]=new int[5];
String Name[]=new String[5];
int Balance[]=new int[5];
String EncryptedPwd[]=new String[5];
int customerid=11;
int accountnum=11011;
int k=0;

public void initialize(){
	custId[k]=customerid;
	AccountNo[k]=accountnum;
	Name[k]=s.next();;
	Balance[k]="10000";
	EncryptedPwd[k]=s.next();
	 k++;
	  System.out.println("custId\t"+"AccountNo\t"+"Name\t"+"Balance\t"+"EncryptePwd\t");
	 for(int i=0;i<2;i++){
	 System.out.println(custId[i]+"\t"+AccountNo[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+EncryptePwd[i]+"\t");
	 }
	 //BankCustomer.show();
}
/*public void show(){
	 System.out.println("custId\t"+"AccountNo\t"+"Name\t"+"Balance\t"+"EncryptePwd\t");
	 for(int i=0;i<2;i++){
	 System.out.println(custId[i]+"\t"+AccountNo[i]+"\t"+Name[i]+"\t"+Balance[i]+"\t"+EncryptePwd[i]+"\t");
	 }*/

}
public void Add_customer(){
	
	
}

}