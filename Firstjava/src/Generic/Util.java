package Generic;

public class Util {
	public static <T extends Number> int compare(T t1,T t2) {
		//T�� number�� �ڽ� ��ü���� �Ѵ�.
		// ��üŸ�� ����, �Ǽ�,,,
		double v1=t1.doubleValue();//double�� Ÿ�� �ٲٱ�
		double v2=t2.doubleValue();//double�� Ÿ�� �ٲٱ�
		
		return Double.compare(v1, v2);
	}

}
