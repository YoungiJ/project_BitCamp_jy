package IOfile;

import java.io.*;
public class DataStreamEx {
	//primitive으로 고치는 건가
	public static void main(String[]args) throws Exception{
	//DataOutputStream과 DataInputStream을 사용하면 데이터가 이진(binary) 형식으로 저장되고 읽힘
		//dataoutputstream을 사용해서 문자열, double, int 을 이진 형식으로 씀
	FileOutputStream fos=new FileOutputStream("C:/Picture/data2.txt");
	DataOutputStream dos=new DataOutputStream(fos);
	
	
	dos.writeUTF("홍길동");
	dos.writeDouble(95.5);
	dos.writeInt(1);
	
	dos.writeUTF("감자바");
	dos.writeDouble(91.1);
	dos.writeInt(2);
	dos.flush();dos.close();fos.close();
	
	FileInputStream fis=new FileInputStream("C:/Picture/data2.txt");
	DataInputStream dis=new DataInputStream(fis);
	
	
	//기본 타입 입력
	//이 프로그램이 정상적으로 동작하는지 확인하려면, 텍스트 파일이 아니라 프로그램의 출력(콘솔)을 봐야함
	for(int i=0;i<2;i++) {
	String name=dis.readUTF();
	double score=dis.readDouble();
	int order=dis.readInt();
	System.out.println(name+":"+score+":"+order);
	}
	}

}
