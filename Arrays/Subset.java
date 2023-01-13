import java.util.*;
class Subset{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
//int n=s.nextInt();
String str=s.next();
char a[]=str.toCharArray();
/*for(int i=0;i<n;i++){
	a[i]=s.next().charAt(i);
}*/
for(int i=0;i<=a.length-1;i++){
	for(int j=i;j<=a.length-1;j++){
		for(int k=i;k<=j;k++){
			
	 System.out.print(a[k]+" ");		
		}
	System.out.println();
	}
	
}

}
}