import java.util.*;
class LongSubSet{
	static int count=0;
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
 int ans=0;
boolean c[]=new boolean[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();

for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
	if(a[i]==a[j]){	
		c[i]=true;
	    //count++;
	}
	}
}

for(int i=0;i<n;i++){
	if(c[i]!=true)
System.out.print(a[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++){
	if(i>0 && a[i]==a[i-1]+1){
		//System.out.print(a[i]+" ");
		count++;
		//System.out.println("the count is-"+count);
	}
	else
		count=1;
		//System.out.println("the count is-"+count);
ans=Math.max(ans,count);
}
//System.out.println(Arrays.toString(a));
System.out.println("the count is-"+ans);

}
}