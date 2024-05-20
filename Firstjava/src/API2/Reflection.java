package API2;

import java.lang.reflect.Constructor;


public class Reflection {
	public static void main(String[]args) {
	Class clazz=Car.class;
	System.out.println("생성자 정보");
	Constructor[] constructors=clazz.getDeclaredConstructors();
	for(Constructor con: constructors) {
		System.out.println(con);
	}
	
	//리플랙션:meta data-> 수정하는 행위
	}
}
