package vk.small.programs.override;

import java.io.IOException;

public class B extends A{
	public void msg() throws IOException{
		System.out.println(" B msg print");
	}
	public void m1(){
		System.out.println(" B m1");
	}
}
