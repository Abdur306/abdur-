import java.util.*;
class RemoveDup{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int count=0;
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(a[i]==a[j]){
			a[j]=10000;
			count++;
		}
	}
//	if(a[i]!=0)
	//	System.out.print(a[i]+" ");
}
for(int i=0;i<n;i++){
	if(a[i]!=10000)
		System.out.print(a[i]+",");
	
}
for(int i=0;i<count;i++)
	System.out.print("- ,");
//System.out.println(Arrays.toString(a));

}

}