package API2;

import java.io.IOException;

public class KeyboardToString {
	public static void main(String[]args) throws IOException {
	
	byte[] bytes=new byte[100];
	
	System.out.println("ÀÔ·«:");
	int readByteNo=System.in.read(bytes);
	System.out.println(readByteNo);
	for(int i=0;i<readByteNo;i++) {
		System.out.println(bytes[i]);
	}
	String str= new String (bytes,0,readByteNo-2);
	System.out.println(str);
	
	
	}}
