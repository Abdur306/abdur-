import java.util.*;
class Permutation{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char c[]=str.toCharArray();
Per(c,0,c.length-1);
}
public static void Per(char c[],int start,int end){
	
	if(start==end){
	   for(int i=0;i<c.length;i++)
		   System.out.print(c[i]);
	}System.out.println();
	for(int i=start;i<=end;i++){
		swapp(c,i,start);
		Per(c,start+1,end);
		swapp(c,i,start);
	}
}
public static void swapp(char a[],int i,int j){
	char temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
}