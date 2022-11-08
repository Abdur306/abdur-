import java.util.*;
public class ArrAnagram{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String a[]=new String[n];
for(int i=0;i<n;++i){
	a[i]=s.next();
}
String b=s.next();
for(int i=0;i<b.length();++i){
	for(int j=i+1;j<n;++j){
	if(b.charAt(i)==a[j].charAt(j)){
System.out.println(a[j]);		
	}
}
}
}
}