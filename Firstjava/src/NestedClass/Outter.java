package NestedClass;


public class Outter {
	
	String field="Outter field";
	void method() {
		
		System.out.println("Outter method");
	}
	
	class Nested{
		
		
		String field="Nested field";

		void method() {
			
			System.out.println("Nested method");
		}
		
		void print() {
			
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
//			Outter.method(); 이렇게 쓰려면 method가 static이어야한다.
			Outter.this.method();
			
		}
		
		
	}

}
