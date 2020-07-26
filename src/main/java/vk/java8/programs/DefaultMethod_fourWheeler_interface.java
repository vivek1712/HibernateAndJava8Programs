package vk.java8.programs;

public interface DefaultMethod_fourWheeler_interface {
	public default void print(){
		System.out.println("four wheeler default print method");
		
	}

	/*public default void printAnother(){
		System.out.println("four wheeler default print another method");
		
	}*/

	public static void printStatic(){
		System.out.println("four wheeler static print method");
	}

	/*public static void printStaticAnother(){
		System.out.println("four wheeler static print anotjer method");
	}*/
}
