package chpter01;

public class Singleton {
	private static Singleton s1=new Singleton();
	//������
	private Singleton(){};
	
	
	//�ּ� ��ȯ
	static Singleton getInstance() {
		return s1;
	}

}
