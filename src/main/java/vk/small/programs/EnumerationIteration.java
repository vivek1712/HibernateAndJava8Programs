package vk.small.programs;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationIteration {
public static void main(String arg[]){
	Enumeration listEnum;
	Vector<Integer> arrayList=new Vector<Integer>();
	arrayList.add(1);
	arrayList.add(5);
	arrayList.add(2);
	listEnum=arrayList.elements();
	
	while(listEnum.hasMoreElements()){
		
		System.out.println(" numbers: "+listEnum.nextElement() + " hash code " +listEnum.hashCode());
	}
	
}
}
