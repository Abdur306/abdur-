import java.util.*;
class Day1Q5{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int freq[]=new int[n];
for(int i=0;i<n;i++){
   a[i]=s.nextInt();
    freq[i]=-1;
}
for(int i=0;i<n;++i){
	int count=1;
	for(int j=i+1;j<n;j++){
	if(a[i]==a[j]){	
		count++;
	    freq[j]=0;
	}
	}
	if(freq[i]!=0){
		freq[i]=count;
	}
}

for(int i=0;i<n;++i){
if(freq[i]%2!=0){
	System.out.println(a[i]+" "+freq[i]);
	
    
	}
}
	}
}