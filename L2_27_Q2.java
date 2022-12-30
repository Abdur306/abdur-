import java.util.*;
class L2_27_Q2{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
int uc,lc,sp,num;
uc=lc=sp=num=1;
int size=str.length();
if(size>=8){
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>='A' && str.charAt(i)<='Z')
	uc--;
	if(str.charAt(i)>='a'&& str.charAt(i)<='z')
		lc--;
    if(str.charAt(i)>=48 && str.charAt(i)<=57 )
     num--;
    if(str.charAt(i)>=32 && str.charAt(i)<=46 || str.charAt(i)==64)
		 sp--;
	 
	}
	if((uc<1&&lc<1)||(lc<1&&sp<1)||(sp<1&&num<1)||(num<1&&uc<1))
		System.out.println("Medium");
	else if(uc<1||lc<1||sp<1||num<1)
		System.out.println("Good");
	else if(uc>=1	 && lc>=1 && sp>=1 && num>=1)
		System.out.println("Strong");
	else if(str.length()<8)
		System.out.println("Weak");
	}else
	System.out.println("Weak");

}
}