import java.util.*;
class L2_27_Q6{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
   boolean flag=false;
	System.out.println("Enter h1..");
		int h1=s.nextInt();
		System.out.println("Enter h2..");
		int h2=s.nextInt();
		for(int i=0;i<n;i++){
			int index=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[index])
					index=j;
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}

		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					if((a[i]+a[j]+a[k]==h1)){
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						System.out.print("&");
						flag=true;
						break;
				}
				else if((a[i]+a[j]+a[k]==h2)){
					    System.out.print(a[i]+" "+a[j]+" "+a[k]);
						System.out.println("");
						flag=true;
						break;
				}
				}
			if(flag==true)
				break;				
			}
			//if(flag==true)
				//break;		
		}
	}
}