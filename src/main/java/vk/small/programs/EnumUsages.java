package vk.small.programs;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumUsages {
public static void main(String arg[]){
	HotelsEnum e = null;
	System.out.println("Single hotel : "+e.kfc);
	System.out.println("Single hotel  value of: "+e.valueOf("taj"));
	HotelsEnum eArray[]=e.values();
	for(HotelsEnum en:eArray){
		
		System.out.println("All enum values" + en);
		
	}
	
	for(HotelsEnum he:e.values()){
		System.out.println("For each : "+he);
	}
	
	System.out.println("Enum with constructor start ::::::::::::::::");
	System.out.println("Enum A2a(2) call :: " + EnumWithValues.a2a);
	
	for(EnumWithValues val:EnumWithValues.values()){
		System.out.println("All Enum with value :::"+val);
	}
	System.out.println("Enum A2a(2) call  constructor val  and Name:: " + EnumWithValues.a2a.getVal() + "  :"+ EnumWithValues.a2a.getName());

	System.out.println("Enum with value call constructor"+EnumWithValues.vivek+"   val  "+EnumWithValues.vivek.getVal());
	EnumSetEx esx = null;
	Set<EnumSetEx> se=EnumSet.of(esx.mon,esx.sun);
	Iterator itr=se.iterator();
	while(itr.hasNext()){
		System.out.println("Set Enum : "+itr.next());
	}
	
	EnumMap<EnumSetEx,Integer> ma=new EnumMap<EnumSetEx,Integer>(EnumSetEx.class);
	ma.put(EnumSetEx.sun, 1);
	ma.put(EnumSetEx.mon, 2);
	
	
}
}
