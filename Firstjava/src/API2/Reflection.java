package API2;

import java.lang.reflect.Constructor;


public class Reflection {
	public static void main(String[]args) {
	Class clazz=Car.class;
	System.out.println("������ ����");
	Constructor[] constructors=clazz.getDeclaredConstructors();
	for(Constructor con: constructors) {
		System.out.println(con);
	}
	
	//���÷���:meta data-> �����ϴ� ����
	}
}
