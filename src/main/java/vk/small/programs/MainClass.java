package vk.small.programs;

public class MainClass {
public static void main(String arg[]){
//	ClassB objA=new ClassA(); not working
	System.out.println("-------------over riding so Class A to B(extends A) calls b method ---------------------");
	ClassA obj=new ClassB();
	obj.printMsg();
	System.out.println("-------- ClassA obj=new ClassB(); but can all over ride method in Class B , normal method in Class A--------------------------");
	obj.onlyA();
	obj.interA();
	System.out.println("----------------------------------");
	ClassB objb=new ClassB();
	System.out.println("------------ ClassB objb=new ClassB(); normal so can call all inside ClassB method can get Class A normall methods----------------------");
	objb.printMsg();
	objb.onlyB();
	objb.onlyA();
	objb.interA();
	ClassA objA=new ClassA();
	System.out.println("---------ClassA objA=new ClassA(); calls all only inside ClassA -------------------------");
	objA.onlyA();
	objA.printMsg();
	objA.interA();
	}
}
