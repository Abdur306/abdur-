import java.util.*;
class SubLimit{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
System.out.println("Size");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
boolean res=true;
int count=0;
System.out.println("enter the target");
int k=s.nextInt();
int total=0;
for(int i=0;i<k;i++){
//for(int j=i;j<k;j++){
	total+=a[i];
	}
	int c_total=total;
		//res=false;
    for(int i=k;i<n;i++){
	c_total+=a[i]-a[i-k];
	}
	c_total=c_total>total?c_total:total;
  
	 System.out.println(c_total+" ");	
}
}
/*
if(res)
	System.out.println("not found");
else
System.out.println("Possibilities : "+count);
}
}*/
