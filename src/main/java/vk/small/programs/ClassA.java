package vk.small.programs;

public class ClassA implements InterfaceA{
public void printMsg(){
	System.out.println(" print method in class A");
}
public void onlyA(){
	System.out.println("print only A method");
}
@Override
public void interA() {
	// TODO Auto-generated method stub
	System.out.println("inter A method in itnerface A impl");
}

}
