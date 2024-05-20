package NestedClass;

public class Button {
	//static interface
		//abstract method
	
	public static interface CL{
		void onClick();
	}
	//필드
	private CL cl;
	
	//그냥 메서드
	public void setClickListener(CL cl) {
		this.cl=cl;
	}
	// 왜 만드냐-> interface 안에 onclick을 선언만하고 구현안해서 - Button.cl.onclick tlqkf
	public void click() {
		this.cl.onClick();//버튼이 클릭될때 실행하는 메서드 선언
		
	}
}
