import java.util.*;
class ArraysManupilation{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
Details ds=new Details();
System.out.println("1.Default || 2.Add || 3.view || 4.update");
int n=s.nextInt();
switch(n){
	case 1:
	      ds.default();
	case 2:
	
	case 3:
	
	
	
}

}
}
class Details{
static int Id[]=new int[5];
static String name[]=new String[5];
static int age[]=new int[5];
static String gender[]=new String[5];
static String designation[]=new String[5];
static int ph[]=new int[5];
int id=(999+1);
static int k=0;

public static void default(){
	Id[0]=id++;
	name[0]="Abdur";
	age[0]=20;
	gender[0]="Male";
	designation[0]="worker";
	ph[o]=8933****;
	
	Id[1]=id++;
	name[1]="Jameel";
	age[1]=21;
	gender[1]="Male";
	designation[1]="worker";
	ph[1]=9898****;
	
	System.out.println("ID\t"+"Name\t"+"Age\t"+"Gender"+"Desig"+"Phone\t");
	for(int i=0;i<2;i++)
		System.out.println(Id[i]+"\t"+name[i]+"\t"+age[i]+"\t"+gender[i]+"\t"+designation[i]+"\t"+ph[i]+"\t");
	
}
public static void addMems{
	Scanner s1=new Scanner(System.in);
	Id[k]=s1.nextInt();
	name[k]=s1.next();
	age[k]=s1.nextInt();
	gender[k]=s1.next();
	designation[k]=s1.next();
	ph[k]=s1.nextInt();
	k++;
	Display();
}

public static void Display(){
	System.out.println("ID\t"+"Name\t"+"Age\t"+"Gender"+"Desig"+"Phone\t");
	for(int i=0;i<k;i++)
		System.out.println(Id[i]+"\t"+name[i]+"\t"+age[i]+"\t"+gender[i]+"\t"+designation[i]+"\t"+ph[i]+"\t");
	
	
}
public static void view(){
	for(int i=0;i<5;i++){
		
	}
	}

}