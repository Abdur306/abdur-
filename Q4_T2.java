import java.util.*;
class Q4_T2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int size=2*n-1;
int l=0;int r=size-1;
int a[][]=new int[size][size];
while(n!=0){
for(int i=l;i<=r;i++){
	for(int j=l;j<=r;j++){
		if(i==l||i==r||j==l||j==r){
			a[i][j]=n;
}		
}
}
++l;
--r;
--n;
}
for(int i=0;i<size;i++){
	for(int j=0;j<size;j++){
	System.out.print(a[i][j]+"  ");
	
	}
	System.out.println();
}

}
}
