package vk.small.programs;

public class TestShutHook {
public static void main(String arg[]){
	Runtime r=Runtime.getRuntime();
	r.addShutdownHook(new MultiThread("Test Hook"));
	System.out.println("press Ctrl + c");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
