package vk.java8.programs;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExJava8 {
public static void main(String arg[]){
	List<String> li=Arrays.asList("vk","","a2","","raj");
	li.forEach(obj->{System.out.println("intital");
	System.out.println(obj);});
	List<String>filtered=li.stream().filter(obj->!obj.isEmpty()).collect(Collectors.toList());
	System.out.println("Afer removed empty");
	
	filtered.forEach(System.out::println);
	
	System.out.println("filtered only vk and a2");
	Predicate<String> p1=s->s.startsWith(s,'v')||s.startsWith(s, 'a');
	boolean check=li.stream().filter(obj->!obj.isEmpty()).anyMatch(p1);
	
	List<String> onlyMatched=filtered.stream().filter(p1).collect(Collectors.toList());
	onlyMatched.forEach(System.out::println);
	
	List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

	//get list of unique squares
	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
	
	System.out.println("using map change the values and print");
	squaresList.forEach(System.out::println);
	
	System.out.println("only 3 limit");
	List<Integer>lim=numbers.stream().limit(3).collect(Collectors.toList());
	lim.forEach(System.out::print);
	
	String strL=li.stream().filter(obj->!obj.isEmpty()).collect(Collectors.joining(","));
System.out.println("print ::::::"+strL);

System.out.println("map and statistics");
List<Integer>liNum=Arrays.asList(1,2,3,4,5);

IntSummaryStatistics stat=liNum.stream().mapToInt(ob->ob).summaryStatistics();

System.out.println("Highest number in List : " + stat.getMax());
System.out.println("Lowest number in List : " + stat.getMin());
System.out.println("Sum of all numbers : " + stat.getSum());
System.out.println("Average of all numbers : " + stat.getAverage());
}
}
