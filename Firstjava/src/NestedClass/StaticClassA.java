package NestedClass;


/*
 * 1. ���ο��� B��ü�� �� ����ϴ°�
 * 2. ������ �ϳ��� �𸣰ڴ�
 * 
 * 
 * 
 * */


public class StaticClassA {

//static Ŭ���� B
	
	static class B{
		//������
		B(){
			System.out.println("B������");
		};
		
		//�ν� �ʵ�
		int field1=1;
		
		//static �ʵ�
		static int field2=2;
		
		//�ν� �޼���
		void method1() {
			System.out.println("B�ν� �޼���");
		}
		//static method
		static void method2() {
			System.out.println("Bstatic �޼���");
		}
		
		
	}
	
	//A������
	public StaticClassA() {
		// TODO Auto-generated constructor stub
	}
	
	//�ν� �ʵ�
	//�ν� �޼���
	
	//static �ʵ�
	//static method
	
	
}
