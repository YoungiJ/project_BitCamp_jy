package chpter01;

public class Singleton {
	private static Singleton s1=new Singleton();
	//생성자
	private Singleton(){};
	
	
	//주소 반환
	static Singleton getInstance() {
		return s1;
	}

}
