package IOfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadEx {

	public static void main(String[]args){
	
	
	try {
	//파일 생성-> 데이터 있어도 기존 데이터를 없애고 덮어씌움
		Reader reader=null;
		
		
		reader=new FileReader("C:/Picture/data2.txt");
		while(true) {
			int data=reader.read();//data<- 4byte
			if(data==-1) {
				break;}
				System.out.println((char)data);//char를 읽으니까 2byte
			}
					
			
		reader.close();
		System.out.println();

	
	
	
	//배열로 읽기
		reader=new FileReader("C:/Picture/data2.txt");
		char[] data=new char[10];
		while(true) {
			int num=reader.read(data);//data<- 4byte
			if(num==-1) {
				break;}
			
			for(int i=0;i<num;i++) {
				System.out.println(data[i]);
			}
		
		}reader.close();	
	}catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	}

}
