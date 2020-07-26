package vk.java8.programs;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Ex {
public static void main(String arg[]){
	String base64encodedString = Base64.getEncoder().encodeToString("vivek@123".getBytes());
	System.out.println("Encode vivek@123 : "+base64encodedString);
	byte[] bytedecode=Base64.getDecoder().decode(base64encodedString);
	System.out.println("Decode byte   : "+bytedecode);
	System.out.println("original str : "+new String(bytedecode));
	
	System.out.println("/n");
	System.out.println("--------------- utf 8-----------");
	
	String base64encodedStringutf = null;
	try {
		base64encodedStringutf = Base64.getEncoder().encodeToString("vivek@123".getBytes("utf-8"));
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Encode vivek@123 : "+base64encodedStringutf);
	byte[] bytedecodeutf=Base64.getDecoder().decode(base64encodedStringutf);
	System.out.println("Decode byte utf  : "+bytedecodeutf);
	System.out.println("original str utf: "+new String(bytedecodeutf));
	
}
}
