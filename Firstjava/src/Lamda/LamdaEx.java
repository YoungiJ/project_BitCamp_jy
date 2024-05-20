package Lamda;


public class LamdaEx {
	public static void main(String[] args) {
	//람다식->익명구현 객체 (이름이 없는 인터페이스 객체 원래 implements를 해야되는데_)
	action((x,y)->{
		
		//데이터 처리부
		int result=x+y;
		System.out.println(result);
	});
	
	
	action((x,y)->{
		
		//데이터 처리부
		int result=x-y;
		System.out.println(result);
	});
	
	}
	//action 함수 실행 interface 매개변수에 익명 구현객체가 들어감= 타입이 interface
	public static void action(Calculable calculable) {
		int x=10;
		int y=4;
		calculable.calculate(x, y);// interface에 갔지만 구현은 람다식에서 했기때문에 (x,y)-> 데이터 처리부에서 계산
	}
	
	
}
