package vk.small.programs;

public class MultiThread extends Thread{
	MultiThread(String Name){
		super(Name);
	}
public void run(){
	try {
		if(Thread.currentThread().isDaemon()){
			System.out.println("demon thread");
		}
		if(getName().equalsIgnoreCase("m1")){
		//Thread.sleep(500);
		//	System.out.println("sleep 500 mili");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("print multi thread  :  "+ getName());
	
}
}
