import java.util.*;
class Area{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
float r;
double area,peri;
r=s.nextInt();
area=2*3.14*r;
peri=3.14*r*r;
System.out.println("Area of circle"+area);
System.out.println("Peri of circle"+peri);
}
}