package API2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	@Target(ElementType.METHOD)//적용대상 선택
	@Retention(RetentionPolicy.RUNTIME)//적용유지 -> runtime은 실행할때 적용되서 계속 유지됨
	
	public @interface PrintAnnotation{
		String value() default "-";// abtract 처럼 () , default지정할수도 안할 수도, value에 값이 자동으로 들어감
		int number() default 154;
	}
