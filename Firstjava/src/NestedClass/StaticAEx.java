package NestedClass;

public class StaticAEx {
	public static void main(String[]args) {
	
		//b°´Ã¼¿¡ Á¢±Ù
		StaticClassA.B b=new StaticClassA.B();
		//ins
		System.out.println(b.field1);
		b.method1();
		//static
		System.out.println(StaticClassA.B.field2);
		StaticClassA.B.method2();
	}

}
