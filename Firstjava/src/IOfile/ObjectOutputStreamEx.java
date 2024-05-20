package IOfile;

import java.io.*;
import java.util.Arrays;



public class ObjectOutputStreamEx {
	public static void main(String[]args) throws Exception{
	
		FileOutputStream fos=new FileOutputStream("C:/Picture/data2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		
		Member m1=new Member("fail","배고파");
		Product p1=new Product("노트북",1234567);
		int[]arr= {1,2,3};
		
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr);
	
	
		oos.flush();oos.close();fos.close();
	
		//파일input stream에서 objectinput stream 보조 스트림을 연결
		FileInputStream fis=new FileInputStream("C:/Picture/data2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Member m2=(Member)ois.readObject();
		Product p2=(Product)ois.readObject();
		int[]arr2= (int[])ois.readObject();
		ois.close();fis.close();
		System.out.println(m2);
		System.out.println(p2);
//		System.out.println(arr2);
		//System.out.println(m2);를 호출할 때 자동으로 m2 객체의 toString() 메서드가 실행
		
		//toString으로 바꾸면-> 안의 값들이 출력됨
		System.out.println(Arrays.toString(arr2));

		

	
	}
}
