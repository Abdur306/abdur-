import java.util.*;
class Q3_T2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char []y=str.toCharArray();
int len=y.length;
char temp;
for(int i=0;i<len-1;i++){
	for(int j=0;j<len-i-1;j++){
		if(y[j]<y[j+1]){
		 temp=y[j];
			y[j]=y[j+1];
			y[j+1]=temp;
		}
	}
}
for(int i=0;i<str.length();i++)
System.out.print(y[i]);
}
}