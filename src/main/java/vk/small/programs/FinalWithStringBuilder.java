package vk.small.programs;

public class FinalWithStringBuilder {
public static void main(String arg[]){
	final int a=8;
	final StringBuilder st=new StringBuilder("vk");
	st.append("a");
	System.out.println("we can append but not assign ref to final value"+st);
	//st=new StringBuilder("ak");
	
	System.out.println("integer added");
}
}
