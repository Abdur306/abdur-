import java.util.*;
public class CI{
public static void main(String [] args ){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []a=new int[n];
for(int i=0;i<n;++i)
a[i]=s.nextInt();

for(int i=0;i<n;++i)
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
Boolean r=new Boolean[n];
int count=0;
for( i=0;i<n;++i){
count=1;
if(r[i]==true)
continue;

for(j=i+1;j<n;++j)
if(a[i]==a[j])
r[j]=true;
count++;
}
System.out.println(a[i]+count);
}
}
}