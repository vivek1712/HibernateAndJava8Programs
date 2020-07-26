package vk.java8.programs;

public class strImmutable {
public static void main(String arg[]){
	String str="vivek";
	String s=str;
	str=str.concat("  concat");
	System.out.println("assigned str to s and print s  "+s);
	System.out.println("str variable  "+str);
	
	String s1="vivek";
	String s2="vivek";
	String s3=new String("vivek");
	String s4="abcdefgh";
	System.out.println("s1 and s2 ==  "+s1==s2);
	System.out.println(" s1 and s2 equals "+s1.equals(s2));
	System.out.println(" s1 and s3 == "+s1.equals(s3));
	System.out.println("Compate to s1 and s2  : "+s1.compareTo(s2));
	System.out.println("compare to s1 and s4  : "+s1.compareTo(s4));
}
}
