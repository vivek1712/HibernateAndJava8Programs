package vk.java8.programs;

public interface DefaultMethod_vehile_interface {
public default void print(){
	System.out.println("vehicle default print method");
	
}

/*public default void printAnother(){
	System.out.println("vehicle default print another method");
	
}*/

public static void printStatic(){
	System.out.println("vehicle static print method");
}

/*public static void printStaticAnother(){
	System.out.println("vehicle static print anotjer method");
}*/
}
