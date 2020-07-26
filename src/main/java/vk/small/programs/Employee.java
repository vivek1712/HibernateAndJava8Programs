package vk.small.programs;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private int age;
private long salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}

// so we need to implement comparable interface .. only one can do
/*public int compareTo(Employee emp){
	return (this.id-emp.id);
}*/

public int compareTo(Employee emp){
	return (this.name.compareTo(emp.getName()));
}

// we need more sorting so we implements comparator interface
public static Comparator<Employee> salaryComp=new Comparator<Employee>(){
	public int compare(Employee e1,Employee e2){
		return (int) (e1.getSalary()-e2.getSalary());
	}
};

public static Comparator<Employee>nameComp=new Comparator<Employee>(){
	public int compare(Employee e1,Employee e2){
		return e1.compareTo(e2);
	}
};

}
