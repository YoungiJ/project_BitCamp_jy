package API2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	@Target(ElementType.METHOD)//������ ����
	@Retention(RetentionPolicy.RUNTIME)//�������� -> runtime�� �����Ҷ� ����Ǽ� ��� ������
	
	public @interface PrintAnnotation{
		String value() default "-";// abtract ó�� () , default�����Ҽ��� ���� ����, value�� ���� �ڵ����� ��
		int number() default 154;
	}
