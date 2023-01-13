import java.util.*;
class PosDivisors{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int total=0;
for(int i=1;i<n;i++){
	if(n%i==0){
		total+=i;
	}
}
	if(total==n)
		System.out.println("True");
	else
		System.out.println("False");
	
}
}

