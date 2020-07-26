package vk.small.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortNullLast {
public static void main(String arg[]){
	
	Long arrayL[]={2L,5L,null,null,1L,3L};
	List<Long>lis=new ArrayList<Long>();
	List<Long>nullList =new ArrayList<Long>();
	for(Long ar:arrayL){
		if(ar!=null){
		lis.add(ar);
		}else{
			nullList.add(ar);
		}
	}
	
	
	Collections.sort(lis);
	lis.addAll(nullList);
	for(Long li:lis){
		System.out.println(" valu :::"+li);
	}
}
}
