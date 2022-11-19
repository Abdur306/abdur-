import java.util.*;
class Q4_17{
public static void main(String [] abu){
Scanner s1=new Scanner(System.in);
int start=0,end=0;
String str=s1.nextLine();
char [] y=str.toCharArray();
reverse(y,0,y.length-1);
for(end =0;end<y.length;end++)
	if(y[end]==' '){
		reverse(y,start,end-1);
		start=end+1;
	}
	reverse(y,start,end-1);
	System.out.println(y);
}
static void reverse(char []y,int start,int end){
	
	while(start<end){
		char temp=y[start];
		y[start]=y[end];
		y[end]=temp;
		start++;
		end--;
		
	}
}
}
