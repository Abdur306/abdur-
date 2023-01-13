import java.util.*;
class Sq{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char y[]=str.toCharArray();
int start=0,end=0;
reverse(y,0,y.length-1);
for(int i=0;i<y.length;i++){
	if(y[i]==32){
		reverse(y,start,end-1);
		start=end+1;
		}
		reverse(y,start,end-1);
		System.out.println(y);
	
}
}


public static void reverse(char y[],int s,int e){
	while(s<e){
		char temp=y[s];
		y[s]=y[e];
		y[e]=y[temp];
        s++;e--;	
	}
	
}	
}
