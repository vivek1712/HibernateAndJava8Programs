package vk.java8.programs;

import java.util.ArrayList;
import java.util.List;

public class LampdaMethodRef {
public static void main(String arg[]){
	List<String> li=new ArrayList<String>();
	li.add("vk");
	li.add("raj");
	li.add("raj");
	li.forEach(System.out::println);
	//LampdaMethodRef::hi;
}

public static void hi(){
	System.out.println("vvv");
}
}
