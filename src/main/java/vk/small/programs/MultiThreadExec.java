package vk.small.programs;

public class MultiThreadExec {
public static void main(String arg[]) throws InterruptedException{
	MultiThread m1=new MultiThread("m1");
	MultiThread m2=new MultiThread("m2");
	
	MultiThread m3=new MultiThread("m3");
	m3.setDaemon(true);
	m1.setPriority(Thread.MIN_PRIORITY);
	m2.setPriority(Thread.MAX_PRIORITY);
	m1.start();
	m3.start();
	//m1.join(); // if comments m2 then m1 if un comments m1 and m2
	
	m2.start();
}
}
