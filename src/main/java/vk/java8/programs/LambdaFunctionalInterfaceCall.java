package vk.java8.programs;

public class LambdaFunctionalInterfaceCall {
public static void main(String arg[]){
	String input="Vivek";
	FunctionalInterface fun=(str)->{System.out.println("name : "+str);};
	
	fun.print("a2a");
}
}
