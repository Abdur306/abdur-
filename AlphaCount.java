	import java.util.*;
	class AlphaCount{
	public static void main(String [] abu){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	str+=" ";
   char[]y=str.toCharArray();
   int count=0;
    char c=' ';
   for(int i=0;i<y.length-1;i++) {
	   if((y[i]>=48 && y[i]<=57) && (y[i+1]>=48 && y[i+1]<=57)) {
		   count=(int)(y[i]*10+y[i+1]-48);
		   System.out.println(count);
	   }
	   else {
		   c=y[i];
		 }
		 if(y[i]>=48 && y[i]<=57){
			 count=(int)(y[i]);
		 }
		 else
			 c=y[i];
		 
	 for(int j=0;j<count;j++) {
	    System.out.print(c);
		 // System.out.println(count);
	   }
	   //c="";
	   count=0;
	  
	   
   }
}
	}