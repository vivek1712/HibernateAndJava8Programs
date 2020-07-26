package vk.small.programs.override;

public class TestOverride {
public static void main(String arg[]){
	A obj=new B();
	try{
	obj.msg();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}
}
