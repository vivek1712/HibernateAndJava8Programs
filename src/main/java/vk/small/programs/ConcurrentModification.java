package vk.small.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConcurrentModification {
public static void main(String arg[]){
	List<String> lis=new ArrayList<String>();
	lis.add("vk");
	lis.add("a2a");
	lis.add("ra");
	
	for(String obj:lis){
		System.out.println("before removed  "+obj);
	}
	
	
	List<String> list1=new ArrayList<String>();
	list1.addAll(lis);
	Iterator<String> itr= lis.iterator();
	while(itr.hasNext()){
		if(itr.next()=="a2a"){
			itr.remove();
		}
	}
	for(String obj:lis){
		System.out.println("after removed  "+obj);
	}
	
	Map<String,Integer> mapList=new HashMap<String,Integer>();
	mapList.put("v", 1);
	mapList.put("i", 2);
	mapList.put("e", 3);
	

	
	
	int i=10;
	
	
	Object obj=new Integer(1000);
	String str=(String)obj;
	
	/*for(String obj:lis){
		if(obj.equalsIgnoreCase("ra"))
			lis.remove("ra");
	}*/
}
}
