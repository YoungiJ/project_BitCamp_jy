package NestedClass;

public class ButtonEx {
	
	public static void main(String[]args) {

	
		//ok버튼객체 생성
		Button btOk= new Button();
	
		//ok버튼에  넣을 구현 클래스 생성( 로컬 클래스)
		class Okbut implements Button.CL{//public 넣은거랑 안넣은 거랑 무슨 차이
			@Override
			public void onClick() {
				System.out.println("ok버튼 클래스구현");
			}

		
			
		}
		//ok버튼에 구현객체 주입
		btOk.setClickListener(new Okbut());
		//ok버튼 메서드 실행
		btOk.click();
		
		
		
	
	
		//cancel버튼 객체 생성
		Button btCC=new Button();
		//cancel에 넣을 이벤트 구현 클래스 ( 로컬 클래스)
		class Cancelbut implements Button.CL{
			@Override
			public void onClick() {
				System.out.println("cancel 버튼 구현");
			}			
			
		}
		//cancel버튼에 구현객체 주입
		btCC.setClickListener(new Cancelbut());
		//cancel 버튼 메서드 실행
		btCC.click();
	}
}