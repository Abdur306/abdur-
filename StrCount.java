                                 /*state the count of alpha,numbers,sp.cahrs,space in a sentence*/

import java.util.*;
class StrCount{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int alpha=0;
int number=0;
int space=0;
int special=0;
String str=s.nextLine();
char arr[]=str.toCharArray();
for(int i=0;i<str.length();i++){
if(arr[i]>='a' && arr[i]<='z'||arr[i]>='A' && arr[i]<='Z')
alpha++;
else if(arr[i]==32)
space++;
else if(arr[i]>=48 && arr[i]<=57)
number++;
else
special++;

}
System.out.println("alphabetic tokens"+" "+alpha);
System.out.println("numbers tokens"+" "+number);
System.out.println("spaces tokens"+" "+space);
System.out.println("specail tokens"+" "+special);
}
}