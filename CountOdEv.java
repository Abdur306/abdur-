import java.util.*;
class CountOdEv{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int cev=0;
int cod=0;
for(int i=0;i<n;i++){
	if(a[i]%2==0)
		cev++;
	else
		cod++;
}
System.out.println("Even is= "+cev+" Odd is= "+cod);

}
}