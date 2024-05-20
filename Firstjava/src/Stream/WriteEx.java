package Stream;

import java.io.Console;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[]args) {
		
		try {
			
			OutputStream oStream=new FileOutputStream("C:\\Users\\Public\\test2.txt");
			
//			byte a=10;
//			byte b=20;
//			byte c=30;
			
//			oStream.write(a);
//			oStream.write(b);
//			oStream.write(c);
			byte[] array= {'a','b','c'};
			oStream.write(array);
			
			
			oStream.flush();
			oStream.close();
			
			
			
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
