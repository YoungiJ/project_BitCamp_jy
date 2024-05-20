package NestedClass;

public class Car {
	

	//필드 
	//메서드
	
	//타이어 객체 1 생성
	private Tire tire1=new Tire();

	
	//익명객체2 생성
	private Tire tire2=new Tire() {
		@Override
		//인스 필드,메서드 
		public void roll() 
		{System.out.println("익명객체2 가 굴러가요");}
	};
		
	
	
	//run1(필드,run2(local,run3(매개
	void run1(){
		tire1.roll();
		tire2.roll();
	}	
	
	
	
	//로컬이라면 클래스 안에 익명객체 생성
	
	public void run2() {
		//익명 객체 타이어 생성
			Tire tire=new Tire() {
				@Override
				public void roll() {
					System.out.println("익명객체3 가 굴러가요");
					
				}
				
			};
		//객체 메서드 활용
			tire.roll();
	
	}

	//만든 객체를 넣어주기
	void run3(Tire tire) {
		//객체 메서드 활용
		tire.roll();

		
	}
}
