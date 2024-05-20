package IOfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {

	public static void main(String[]args){
	
	
	try {
	//파일 생성-> 데이터 있어도 기존 데이터를 없애고 덮어씌움
		Writer writer=new FileWriter("C:/picture/WriteEx.txt");
		
		char a='A';
		writer.write(a);
		char b='B';
		writer.write(b);
		writer.write("\n");


		char[] c= {'C','D','E'};
		writer.write(c);
		
		writer.write("FGH");
		System.out.println("출력 완료");
		writer.flush();
		writer.close();
		
	
	}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	}

}
