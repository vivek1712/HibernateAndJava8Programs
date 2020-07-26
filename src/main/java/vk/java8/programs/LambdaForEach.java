package vk.java8.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class LambdaForEach {
public static void main(String arg[]){
	List<String> li=new ArrayList<String>();
	li.add("raj");
	li.add("vivek");
	li.add("a2a");
	
	
	li.forEach(
			
			(s)->{System.out.println("values : "+s);}
			
			);
	Collections.sort(li, (s1,s2)->s1.compareTo(s2));
	
	System.out.println("------------ after sorted list ------------");
	li.forEach(System.out::println);
	
	System.out.println("------------ Student object list ------------");
	
	List<StudentPojo> stu=new ArrayList<StudentPojo>();
	stu.add(new StudentPojo(1, "vivek", "gtn"));
	stu.add(new StudentPojo(2,"a2a","ban"));
	stu.add(new StudentPojo(3,"raj","dgl"));
	
	
	stu.forEach(
			(stuLi)->{
				System.out.println("Stu /Id : "+stuLi.getId());
				System.out.println("Stu name : "+stuLi.getName());
				System.out.println("Stu college : "+stuLi.getCollege());
				
			}
			
			);
	
	//
	
			}
}
