package vk.small.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class comparatorAndComparableEx {
public static void main(String arg[]){
	Employee emp1=new Employee();
	emp1.setId(5);
	emp1.setAge(10);
	emp1.setName("vivek");
	emp1.setSalary(1000);
	
	Employee emp2=new Employee();
	emp2.setId(2);
	emp2.setAge(60);
	emp2.setName("aaa");
	emp2.setSalary(7000);
	
	Employee emp3=new Employee();
	emp3.setId(1);
	emp3.setAge(50);
	emp3.setName("raj");
	emp3.setSalary(3000);
	
	Employee emp4=new Employee();
	emp4.setId(2);
	emp4.setAge(40);
	emp4.setName("karthi");
	emp4.setSalary(1000);
	List<Employee> listEmp=new ArrayList<Employee>();
	listEmp.add(emp1);
	listEmp.add(emp2);
	listEmp.add(emp3);
	listEmp.add(emp4);
	for(Employee em:listEmp){
		System.out.println("id : "+em.getId() + " age : "+em.getAge()+" name :"+em.getName()+" salary :"+em.getSalary());
	}
	Collections.sort(listEmp);
	System.out.println("After comparable : id");
	
	for(Employee em:listEmp){
		System.out.println("id : "+em.getId() + " age : "+em.getAge()+" name :"+em.getName()+" salary :"+em.getSalary());
	}
	
	Collections.sort(listEmp,Employee.salaryComp);
	System.out.println("After Comparator salary based : id");
	
	for(Employee em:listEmp){
		System.out.println("id : "+em.getId() + " age : "+em.getAge()+" name :"+em.getName()+" salary :"+em.getSalary());
	}
	
	Collections.sort(listEmp,Employee.nameComp);
	System.out.println("After Comparator name based : id");
	
	for(Employee em:listEmp){
		System.out.println("id : "+em.getId() + " age : "+em.getAge()+" name :"+em.getName()+" salary :"+em.getSalary());
	}
	
}
}
