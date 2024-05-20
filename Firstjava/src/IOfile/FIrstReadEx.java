
package IOfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class FIrstReadEx {

	public static void main(String[]args){
	
	
	try {
	//파일 생성-> 데이터 있어도 기존 데이터를 없애고 덮어씌움
		InputStream iStream=new FileInputStream("C:/Picture/data2.txt");
		byte[] data=new byte[300];
		Reader reader=null;
		
		
		while(true) {
			int num=iStream.read(data);//data<- 4byte
			if(num==-1) break;
			
			System.out.println(num);
			System.out.println();
			for(int i=0;i<num;i++) {
				System.out.println(data[i]);//char를 읽으니까 2byte
			}
					
		
			iStream.close();
		
			
	}}catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	}

}
