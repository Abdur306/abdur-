import java.util.*;
public class Inherit2{
public static void main(String [] args){
Scanner s=new Scanner(System.in);



}
}
 class Member{
String name;
int age;
int ph_number;
String address;
int Salary;
void ptsalary(){
	
System.out.println("")
}
 }
class Employee extends Member{
	String special;
	
	public Employee(String name,int age,int ph_number,String address,int salary){
		this.name=name;
		this.age=age;
		this.ph_number=ph_number;
		this.address=address;
		this.salary=30000;
	}
	void  depart(String str){
	//	this.salary=30000;
		System.out.println(name"\t",age"\t",ph_number"\t",address"\t",salary);
	}

}
class Manager extends Member{
	String special;

	public Manager(String name,int age,int ph_number,String address,int salary){
		this.name=name;
		this.age=age;
		this.ph_number=ph_number;
		this.address=address;
		this.salary=50000;
	}
		void depart(){
			//this.salary=50000;
			System.out.println(name"\t",age"\t",ph_number"\t",address"\t",salary);
		}
}