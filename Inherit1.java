import java.util.*;
public class Inherit1{
public static void main(String [] args){
//Parent obj=new Parent();
//obj.careTaker();
Child obj1=new parent();
obj1.play();
//obj1.careTaker();
}
}
class Parent{
	public void careTaker(){
	System.out.println("this is parent class");	
	}
}
class Child extends Parent{
	public void play(){
	System.out.println("this is child class");	
	}
}