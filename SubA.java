import java.util.*;
class SubA{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int tagert=s.nextInt();
for(int i=0;i<n;i++){
	
	for(int j=i+1;j<n;j++){
		for(int k=j+1;j<n;j++){
		if(a[i]+a[j]+a[k]==tagert){
			
			System.out.println(a[i]+a[j]+a[k]);
			break;
		}
		}
		
	}
}


}
}


/*: A[] ={2, 6, 0, 9, 7, 3, 1, 4, 1, 10} target = 15
Output: {6, 0, 9}
*/