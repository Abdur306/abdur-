import java.util.*;
class SubArray2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
 int target=s.nextInt();int count=0;   
boolean c[]=new boolean[n]; //{1,4,45,6,0,9}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		//for(int k=i+2;k<n;k++){
		if(a[i]+a[j]==target || a[i]+a[j]== -target){
			System.out.print(a[i]+"+"+a[j]);
		count++;	
		//}
		}
		}
	    }
System.out.println(count);
/*
for(int i=0;i<n;i++){
	if(c[i]!=false){
		System.out.println(a[i]);
	}
}*/
}

}

