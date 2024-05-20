package NestedClass;


import NestedClass.A.B;

public class A {

	
	class B{
		//생성자 
		B(){}
		//인스턴스 멤버
		int field1;
		void method1() {};
			
		
	}
//	A a=new A();
//	A.B b=a.new B();
//	
//	b.field1=3;
//	b.method1(); 외부 클래스-> A
	void methodA() {
		B b=new B();
		b.field1=3;
		b.method1();//내부 클래스에서는 활용가능
		
	}
	//method A를 쓰려면 class A가 메모리에 올라가야함
}
