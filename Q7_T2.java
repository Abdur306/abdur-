import java.util.*;
class Q7_T2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
str+=" ";
String str1="";
int k=0;
String a[]=new String[10];
for(int i=0;i<str.length();i++){
	if(str.charAt(i)==' '){
		a[k]=str1;
		str1="";
		k++;
	}
	else{
		str1+=str.charAt(i);
	}
}
System.out.println(k);
for(int i=0;i<k;i++){
	for(int j=i+1;j<k;j++){
	  if(a[i].equals(a[j]))
		  a[j]="cut";
	  
	}
}
for(int i=0;i<k;i++){
	if(a[i]!="cut")
		System.out.print(a[i]+" ");
	}
}
}
