                                                 /*given  a str to chnage the oder of str*/

import java.util.Scanner;
class ReverseStr{
public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the str to reverse");
    String str=s.nextLine();
//char a[]=new char[];
    char a[]=str.toCharArray();
    int first=0,last=0;
Reverse(a,0,a.length-1);
//int len=a.length();
for(last=0;last<a.length;last++)
    if(a[last]==' '){
Reverse(a,first,last-1);
       first=last+1;
}
Reverse(a,first,last-1);
    System.out.println(a);
}
public static void Reverse(char a[],int first,int last ){
   while(first<last){
   char temp=a[first];
   a[first]=a[last];
   a[last]=temp;
   first++;
   last--;
}
}
}