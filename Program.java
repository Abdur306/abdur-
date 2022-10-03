                                 /*given a str in odd length should be printred frm the middle one*/

import java.util.*;
public class Program{
public static void main(String[] args){
           Scanner s=new Scanner(System.in);
           String str=s.next();
           char st[]=str.toCharArray();
           char a[]=new char[15];
           int len=str.length();
           int k=0;
           int mid=len/2;
    for(int i=mid;i<len;++i)
             a[k++]=st[i];
    for(int i=0;i<len;++i)
             a[k++]=st[i];

    for(int i=len;i>=0;--i){
              k=0;
    for(int j=0;j<len;j++){
             if(j>len-1)
           System.out.print(" ");
//for(int z=0;z<=i;z++){
             if(j<len)

           System.out.print(a[k++]);
}
           len--;
           System.out.println();
}
}
}
//}