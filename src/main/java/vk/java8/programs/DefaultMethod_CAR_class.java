package vk.java8.programs;

public class DefaultMethod_CAR_class implements DefaultMethod_vehile_interface,DefaultMethod_fourWheeler_interface{
public void print(){
	System.out.println("print in default car class");
	DefaultMethod_vehile_interface.printStatic();
	DefaultMethod_vehile_interface.super.print();
	
	DefaultMethod_fourWheeler_interface.printStatic();
	DefaultMethod_fourWheeler_interface.super.print();
}
}
