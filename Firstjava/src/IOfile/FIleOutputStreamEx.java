package IOfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FIleOutputStreamEx {
	public static void main(String[]args) throws Exception{
	
	
	String originFile="C:/picture/test1.png";
	String targetFile="C:/picture/test2.png";
	
	InputStream inInputStream=new FileInputStream(originFile);
	OutputStream osOutputStream=new FileOutputStream(targetFile);
	
	byte[] data=new byte[1024];
	while(true) {
		int num=inInputStream.read(data);
		if(num==-1) {
			break;
		}
		
		osOutputStream.write(data,0,num);
	}
	osOutputStream.flush();
	osOutputStream.close();
	inInputStream.close();
	
	System.out.println("복사 완료");
	
	}
}
