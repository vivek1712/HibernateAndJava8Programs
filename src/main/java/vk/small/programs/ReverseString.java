package vk.small.programs;

public class ReverseString {
public static void main(String arg[]){
	String str="vivek";
	char[] ch=str.toCharArray();
	System.out.println("character length " +ch.length);
	System.out.println("string length "+str.length());
	//System.out.println(ch[4]);
	for(int i=ch.length-1;i>=0;--i){
		System.out.println(ch[i]);
	}
	
			}
}
