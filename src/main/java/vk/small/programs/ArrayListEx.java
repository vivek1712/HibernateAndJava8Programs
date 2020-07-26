package vk.small.programs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
public static void main(String arg[]){
	List arr=new ArrayList();
	arr.add("vivek");
	arr.add("raj");
	arr.add("kamal");
	//System.out.println(" print arr.size value :" + arr.get(arr.size()));
	for(int i=0;i<arr.size();i++){
		System.out.println(" print initial ::::  "+arr.get(i));
		//arr.add("heehee");
	}
	System.out.println("size initial "+arr.size());
	System.out.println("first initial "+arr.get(0));
	
	System.out.println("  ");
	for(int i=0;i<arr.size();i++){
		System.out.println("list size is initial  : " +arr.size());
		System.out.println("remove value    "+arr.get(i)  + "   i value"+i);
		arr.remove(i);
		System.out.println("list size is after deleted  : " +arr.size());
	}
	
	System.out.println("size after removed i "+arr.size());
	
	for(int i=0;i<arr.size();i++){
		System.out.println(" ::::  "+arr.get(i));
	}
	
	System.out.println(" ----------- below occur concurrent exce------------------");
	//for(Object str:arr){
	//	arr.remove(str);
	//}
}
}
