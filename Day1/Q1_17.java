import java.util.*;
class Q1_17{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int row=s.nextInt();
//int col=s.nextInt();
/*int arr[][]=new int [row][row];
for(int i=0;i<row*row;i++){
for(int j=0;j<row;j++){
System.out.print(j);
//System.out.println(i*j);

}
System.out.println();
}*/
int a[]=new int [row];
for(int i=0;i<row*row;i++){
	for(int j=0+1;j<row;j++){
	System.out.print(i*i);
	System.out.print(j);
	//System.out.println(i*j);
	}
	System.out.println();
}
}
}

