package vk.small.programs;

public class ThreadGroupEx implements Runnable {
public void run(){
	System.out.println("run : "+Thread.currentThread().getName());
}
public static void main(String arg[]){
	ThreadGroupEx ex1=new ThreadGroupEx();
	ThreadGroup tg1=new  ThreadGroup("group 1");
	ThreadGroup tg2=new ThreadGroup("group 2");
	Thread t1=new Thread(tg1,ex1,"one");
	t1.start();
	Thread t2=new Thread(tg2,ex1,"two");
	t2.start();
	Thread t3=new Thread(tg1,ex1,"three");
	t3.start();
	//tg1.suspend();
	System.out.println("Group name :: "+tg1.getName());
	tg1.list();
	
	System.out.println("Group name :: "+tg2.getName());
	tg2.list();
	//tg1.resume();
}
}
