import java.util.*;
class ArraysManupilation{
public static void main(String [] abu){


met();
}

public static void met(){
	Scanner s=new Scanner(System.in);
	
Details ds=new Details();
System.out.println("1.Defined|| 2.Add || 3.view || 4.update || 5.Exit" );
int n=s.nextInt();
do{
switch(n){
	case 1:
	      ds.defined();
		  break;
	case 2:
		  ds.addMems();
		  break;
	case 3 :
	      ds.view();
		  break;
	case 4:
	
	      break;
	
	
}
}while(n!=6);
}
}
class Details extends ArraysManupilation{
static int Id[]=new int[5];
static String name[]=new String[5];
static int age[]=new int[5];
static String gender[]=new String[5];
static String designation[]=new String[5];
static int ph[]=new int[5];
static int id=(999+1);
static int k=0;

public static void defined(){
	Id[0]=id++;
	name[0]="Abdur";
	age[0]=20;
	gender[0]="Male";
	designation[0]="worker";
	ph[0]=893354;
	
	Id[1]=id++;
	name[1]="Jameel";
	age[1]=21;
	gender[1]="Male";
	designation[1]="worker";
	ph[1]=98983453;
	
	System.out.println("ID\t"+"Name\t"+"Age\t"+"Gender\t"+"Desig\t"+"Phone\t");
	for(int i=0;i<2;i++)
		System.out.println(Id[i]+"\t"+name[i]+"\t"+age[i]+"\t"+gender[i]+"\t"+designation[i]+"\t"+ph[i]+"\t");
	met();
	
}
public static void addMems(){
	Scanner s1=new Scanner(System.in);
	Id[k]=id++;
	System.out.println("enter the name");
	name[k]=s1.next();
	System.out.println("enter the age");
	age[k]=s1.nextInt();
	System.out.println("enter the gender");
	gender[k]=s1.next();
	System.out.println("enter the desig");
	designation[k]=s1.next();
	System.out.println("enter the phone");
	ph[k]=s1.nextInt();
	 System.out.println("ID\t"+"Name\t"+"Age\t"+"Gender"+"Desig"+"Phone\t");
	 System.out.println(Id[k]+"\t"+name[k]+"\t"+age[k]+"\t"+gender[k]+"\t"+designation[k]+"\t"+ph[k]+"\t");
	 System.out.println("Successfully logged in");
	 met();
	//Display();
}

/*public static void Display(){
	    System.out.println("ID\t"+"Name\t"+"Age\t"+"Gender"+"Desig"+"Phone\t");
	for(int i=0;i<k;i++)
		System.out.println(Id[i]+"\t"+name[i]+"\t"+age[i]+"\t"+gender[i]+"\t"+designation[i]+"\t"+ph[i]+"\t");
	
}*/


public static void view(){
	      System.out.println("ID\t"+"Name\t"+"Age\t"+"Gender"+"Desig"+"Phone\t");
	for(int i=0;i<5;i++)
		  System.out.println(Id[i]+"\t"+name[i]+"\t"+age[i]+"\t"+gender[i]+"\t"+designation[i]+"\t"+ph[i]+"\t");
	  
	  met();
	
	}

}
