package NestedClass;


import NestedClass.A.B;

public class A {

	
	class B{
		//������ 
		B(){}
		//�ν��Ͻ� ���
		int field1;
		void method1() {};
			
		
	}
//	A a=new A();
//	A.B b=a.new B();
//	
//	b.field1=3;
//	b.method1(); �ܺ� Ŭ����-> A
	void methodA() {
		B b=new B();
		b.field1=3;
		b.method1();//���� Ŭ���������� Ȱ�밡��
		
	}
	//method A�� ������ class A�� �޸𸮿� �ö󰡾���
}
