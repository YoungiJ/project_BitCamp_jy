package chpter01;

public class Singleton {
	private static Singleton s1=new Singleton();
	//积己磊
	private Singleton(){};
	
	
	//林家 馆券
	static Singleton getInstance() {
		return s1;
	}

}
