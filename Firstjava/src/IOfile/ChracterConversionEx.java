package IOfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class ChracterConversionEx {
//어 캡쳐 안했다.
	public static void main(String[]args) throws Exception{
		
		
		write1("문자 변환 스트림");
		String data=read();
		System.out.println(data);
	}
	
	public static void write1(String str) throws Exception{
		OutputStream oStream=new FileOutputStream("C:/Picture/nocap.txt");
		Writer writer=new OutputStreamWriter(oStream,"UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
		
		
	
	public static String read() throws Exception{

	InputStream iStream=new FileInputStream("C:/Picture/nocap.txt");
	Reader reader=new InputStreamReader(iStream,"UTF-8");
	char[] data=new char[100];
	int num=reader.read(data);
	reader.close();
	String string=new String(data,0,num);
	return string;
	
	
	}
		
	
		
		
	

	
	
	
}
