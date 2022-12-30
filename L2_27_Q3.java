import java.util.*;
class L2_27_Q3{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
int a[]=new int[str2.length()];
int k=0;
for(int i=0;i<str2.length();i++){
	for(int j=0;j<str1.length();j++){
		//if(str1.charAt(i)>='A'&& str1.charAt(i)<='Z'||str1.charAt(i)>='a'&& str1.charAt(i)>='z' 
		//&& str2.charAt(i)>='A'&& str2.charAt(i)<='Z'||str2.charAt(j)>='a'&& str2.charAt(j)<='z'){
	if(str2.charAt(i)==str1.charAt(j)&& k<str1.length()){
          a[k++]=j;
		  break;
	}
	
	
}
}
int min=a[0];
int max=a[0];
for(int i=1;i<a.length;i++){
	if(a[i]<min)
		min=a[i];
	else if(a[i]>max)
		max=a[i];
}
for(int i=min;i<=max;i++)
System.out.print(str1.charAt(i)+" ");
}
}