package API2;

import java.lang.reflect.Method;

public class PrintAnnotationEx {
	public static void main(String[]args) throws Exception{
		
		Method[] declaredMethod=Service.class.getDeclaredMethods();
		for( Method method:declaredMethod) {
			PrintAnnotation pa=method.getAnnotation(PrintAnnotation.class;)
		}
		printLine(PrintAnnotation);
		
		declaredMethod.invoke(new Service());
		
		printLine(PrintAnnotation);
		
}
public static void printLine(PrintAnnotation printAnnotation) {
	
	if(printAnnotation !=null) {
		
		int number=printAnnotation.number();
		for(int i=0;i<number;i++) {
			String value=printAnnotation.value();
			System.out.println(value);
		}
	System.out.println();
	}
}
}