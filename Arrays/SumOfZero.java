import java.util.*;
class SumOfZero{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int target=s.nextInt();
int occur=0;
int mini=0;
int max=0;
for(int i=0;i<a.length;i++){
	int k=0;
	occur=0;
	for(int j=i;j<a.length;j++){
		k+=a[j];
		if(a[i]==k){
			max++;
			occur++;
		}
		if(k==target)
			mini++;
	}
}
max=((a.length+occur)-max);
if(mini!=0){
	if(max<0){
		max*=-1;
		mini+=max;
	}
	else if(max<=0){
		mini+=max;
	}
System.out.println("The Possible Count is- "+mini);
}
else
	System.out.println(0);
}
}
