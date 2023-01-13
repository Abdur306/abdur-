import java.util.*;
class VowelsSwapQ8{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the String");
String str=s.next();
//char temp;
char y[]=str.toCharArray();
int size=y.length;
for(int i=0;i<size;i++){
	
	if(y[i]=='a' || y[i]=='e' ||y[i]=='i' || y[i]=='o'|| y[i]=='u' || y[i]=='A'|| y[i]=='E' || y[i]=='I'||y[i]=='O' || y[i]=='U'){
		
	for(int j=i+1;j<size;j++){
		
		if(y[j]=='a' || y[j]=='e' ||y[j]=='i' || y[j]=='o'|| y[j]=='u' || y[j]=='A'|| y[j]=='E' || y[j]=='I'||y[j]=='O' || y[j]=='U'){
		  
		char temp= y[i];
		y[i]=y[j];
		y[j]=temp;
	 }  
	}
	
	}
   }
	for(int i=0;i<size;i++){
	System.out.print(y[i]+" ");	
	}
	}
}


	
	
