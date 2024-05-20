package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[]args){
		
		try {
			
			InputStream inStream=new FileInputStream("C:\\Users\\Public\\test2.txt");
			
			while(true) {
				int data=inStream.read();//1byte씩 읽음-> 왜냐 inputstream의 메서드인데 얘는 무조건 바이트로 처리
			
				if(data==-1)break;
				System.out.println(data);
			}
			
			inStream.close();
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
