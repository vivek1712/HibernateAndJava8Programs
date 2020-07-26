package vk.java8.programs;
//functional interface
public class LambdaTesting  {
	public final static String str="vivek";
public static void main(String arg[]){
	LambdaTesting lamTest=new LambdaTesting();
	MathOp mathAdd=(int a,int b) ->a+b;
	MathOp mathSub=(int a,int b)->{return a-b;};
	MsgIntr msgStr=str1->System.out.println("Print messages : "+str1);
	System.out.println(" addition use lambda : "+lamTest.operate(4, 6,mathAdd));
	
	System.out.println(" addition use lambda  cant : "+mathAdd.operation(5, 4));
	
	System.out.println(" subtraction use lambda   : "+mathSub.operation(5, 4));
	
	msgStr.printgivenStr("raj");
}
interface MathOp{
	int operation(int a,int b);
	
}
interface MsgIntr{
	void printgivenStr(String str);
}

private int operate(int a,int b,MathOp mop){
	return mop.operation(a, b);
}

}
