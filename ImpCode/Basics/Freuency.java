import java.util.*;
class Freuency{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
    b[i]=-1;
}
for(int i=0;i<n;i++){
	int count=1;
	for(int j=i+1;j<n;j++){
		if(a[i]==a[j]){
		count++;
        b[j]=0;		
		}
	}
	if(a[i]!=0)
		a[i]=count;
	if(a[i]!=0)
		System.out.println(a[i]+"-"+b[i]);
}
}
}