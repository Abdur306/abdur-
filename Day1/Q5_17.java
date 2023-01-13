import java.util.*;
class Q5_17{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter a1 size");
int m=s.nextInt();
int arr1[]=new int[m];
System.out.println("enter a1 values");
for(int i=0;i<m;i++){
	arr1[i]=s.nextInt();
}
System.out.println("enter a2 size");
int n=s.nextInt();
int arr2[]=new int[n];
System.out.println("enter a2 values");
for(int i=0;i<n;i++){
	arr2[i]=s.nextInt();
}
if(m>n){
missing(m,arr1,n,arr2);
}
else{
	//System.out.println("no");
	missing1(m,arr1,n,arr2);
}
}
public static void missing(int m,int a[],int n,int b[]){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(a[i]==b[j]){
				a[i]=0;
			}
		}
	}
	for(int i=0;i<m;i++){
		if(a[i]!=0){
			
		System.out.println("extrs element is"+a[i]+"="+i+"index");
	}
	}
}
public static void missing1(int m,int a[],int n,int b[]){
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(b[i]==a[j]){
				b[i]=0;
			}
		}
	}
	for(int i=0;i<n;i++){
		if(b[i]!=0){
			
		System.out.println("extrs element is"+b[i]+"="+i+"index");
	}
	}
}
}
