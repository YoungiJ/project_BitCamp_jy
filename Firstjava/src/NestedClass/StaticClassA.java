package NestedClass;


/*
 * 1. 내부에서 B객체를 들어서 사용하는가
 * 2. 생성자 하나도 모르겠다
 * 
 * 
 * 
 * */


public class StaticClassA {

//static 클래스 B
	
	static class B{
		//생성자
		B(){
			System.out.println("B생성자");
		};
		
		//인스 필드
		int field1=1;
		
		//static 필드
		static int field2=2;
		
		//인스 메서드
		void method1() {
			System.out.println("B인스 메서드");
		}
		//static method
		static void method2() {
			System.out.println("Bstatic 메서드");
		}
		
		
	}
	
	//A생성자
	public StaticClassA() {
		// TODO Auto-generated constructor stub
	}
	
	//인스 필드
	//인스 메서드
	
	//static 필드
	//static method
	
	
}
