package vk.small.programs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class StackAndQueueEx {
public static void main(String arg[]){
	Stack<String> st=new Stack<String>();
			st.add("v");
			st.add("i");
			st.add("v");
			st.add("e");
			st.add("k");
			
			System.out.println("Stack Peek : last :"+st.peek());
			st.pop();
			
			System.out.println(" Stack Peek : after pop :"+st.peek());
			
			st.push("k");
			Iterator<String> itr=st.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}

			System.out.println("******** Queue  start with priority queue*********");
			Queue<String> qu=new PriorityQueue<String>();
			
			qu.add("raj");
			qu.add("zaj");
			qu.add("vivek");
			qu.add("a2a");
			
			Iterator<String> itr1=qu.iterator();
			while(itr1.hasNext()){
				System.out.println("list priority queue  : "+itr1.next());
			}
			qu.remove();
			Iterator<String> itr2=qu.iterator();
			while(itr2.hasNext()){
				System.out.println("list priority queue after remove : "+itr2.next());
			}
			System.out.println("priority queue : elelment method  :"+qu.element());
			System.out.println("priority queue : peek method  :"+qu.peek());
			
			System.out.println("Dequeue :::::::::;started :");
			Deque<String> de=new ArrayDeque<String>();
			de.add("vivek");
			de.push("aa");
			de.add("raj");
			for(String str:de){
				System.out.println("dequeue :::::::"+str);
			}
			de.addFirst("zchar");
			de.addLast("zzz");
			for(String str1:de){
				System.out.println("dequeue after added first:::::::"+str1);
			}
			
			System.out.println("Set Started ::::::::::::::::::");
			Set<String> listHas=new HashSet<String>();
			listHas.add("vivek");
			listHas.add("aaa");
			listHas.add(null);
			listHas.add("raj");
			listHas.add(null);
			
			for(String sth:listHas){
				System.out.println("Hash set ::::::"+sth);
			}
			
			
			System.out.println("Set Started ::::::::::::::::::");
			Set<String> linkedHas=new LinkedHashSet<String>();
			linkedHas.add("vivek");
			linkedHas.add("aaa");
			linkedHas.add(null);
			linkedHas.add("raj");
			linkedHas.add(null);
			
			for(String lth:linkedHas){
				System.out.println("Linked Hash set ::::::"+lth);
			}
			
			SortedSet<String> sortedHas=new TreeSet<String>();
			sortedHas.add("vivek");
			sortedHas.add("aaa");
			//sortedHas.add(null);
			sortedHas.add("raj");
			//sortedHas.add(null);
			
			for(String ssth:sortedHas){
				System.out.println("sorted tree  set ::::::"+ssth);
			}
			
			TreeSet<String> treeHas=new TreeSet<String>();
			treeHas.add("vivek");
			treeHas.add("aaa");
			//treeHas.add(null);
			treeHas.add("raj");
			//treeHas.add(null);
			
			for(String trth:treeHas){
				System.out.println(" tree  set ::::::"+trth);
			}
			
			ArrayList ali=new ArrayList();
			ali.add("vivek");
			ali.add(2);
			ali.add(2.3);
			
			for(Object ss:ali){
				System.out.println("non Generic arraylist"+ss);
			}
			
			Map<Integer,String> hmap=new HashMap<Integer,String>();
			hmap.put(1, "vivek");
			hmap.put(1, "aa");
			hmap.put(2, "raj");
			hmap.put(null, "sd");
			Set hmapSet=hmap.entrySet();
			Iterator itrHmap=hmapSet.iterator();
			while(itrHmap.hasNext()){
				System.out.println("Key : "+itrHmap.next());
			}
			
			for(Map.Entry<Integer, String> en:hmap.entrySet()){
				System.out.println("Hash map For Each Key  :"+en.getKey() + "  value : "+en.getValue());
			}
			
			Map<Integer,String> tmap=new TreeMap<Integer,String>();
			tmap.put(7, "vivek");
			tmap.put(3, "aa");
			tmap.put(2, "raj");
			
			
			Set tmapSet=tmap.entrySet();
			Iterator itrtmap=tmapSet.iterator();
			while(itrtmap.hasNext()){
				System.out.println("Key : "+itrtmap.next());
			}
			
			for(Map.Entry<Integer, String> en:tmap.entrySet()){
				System.out.println("For Tree map Each Key  :"+en.getKey() + "  value : "+en.getValue());
			}
			
			
			Map<Integer,String> lhmap=new LinkedHashMap<Integer,String>();
			lhmap.put(7, "vivek");
			lhmap.put(3, "aa");
			lhmap.put(2, "raj");
			lhmap.put(null, "sd");
			
			Set lhmapSet=lhmap.entrySet();
			Iterator lhrtmap=lhmapSet.iterator();
			while(lhrtmap.hasNext()){
				System.out.println("Key : "+lhrtmap.next());
			}
			
			for(Map.Entry<Integer, String> en:lhmap.entrySet()){
				System.out.println("For Linked hash map Each Key  :"+en.getKey() + "  value : "+en.getValue());
			}
			
			
}
}
