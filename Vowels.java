import java.util.*;
public class Vowels{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str= s.next();
//int count=0;
String temp=" ";
/*int n=str.length();
for(int i=0;i<str.length();++i){
	for(int j=i+1;j<str.length();j++){
		if(str.charAt(i)==str.charAt(j))
			count++;
	}
	if(count>0)
	continue;
	
}*/

for(int i=0;i<str.length();++i){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
 {
if(str.charAt(i+1)=='a'||str.charAt(i+1)=='e'||str.charAt(i+1)=='i'||str.charAt(i+1)=='o'||str.charAt(i+1)=='u')
  {
	temp+=str.charAt(i);
	temp+=str.charAt(i);
   }
else
	continue;
  }
else 
temp+=str.charAt(i);	

}
System.out.println(temp);
}
}