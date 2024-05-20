package Generic;

public class Util {
	public static <T extends Number> int compare(T t1,T t2) {
		//T는 number의 자식 객체여야 한다.
		// 객체타입 정수, 실수,,,
		double v1=t1.doubleValue();//double로 타입 바꾸기
		double v2=t2.doubleValue();//double로 타입 바꾸기
		
		return Double.compare(v1, v2);
	}

}
