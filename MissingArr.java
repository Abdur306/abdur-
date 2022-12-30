import java.util.*;
class MissingArr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
boolean c[]=new boolean[n];
for(int i=0;i<n-1;i++)
	a[i]=s.nextInt();

for(int i=0;i<n-2;i++){
	for(int j=0;j<n-i-2;j++){
		if(a[j]>a[j+1]){
   int temp=a[j];
   a[j]=a[j+1];
   a[j+1]=temp;	
	}
	}
}
System.out.println(Arrays.toString(a));
for(int i=0;i<n-1;i++){
	if(a[i]==i+1){
		//c[i]=false;
		continue;
	}
	else{
	System.out.println(i+1);
break;	
	}
}
/*
for(int i=1;i<=n;i++){
if(c[i]!=true){
	System.out.println(i);
     break;
}
}*/

}
}