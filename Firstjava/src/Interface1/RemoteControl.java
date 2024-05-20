package Interface1;

public interface RemoteControl {
	//interface는 자동으로 static final 상수로 설정됨
	// 대문자_ 로 선언하기
	int MAX_VOLUME=10;
	int MIN_VOLUME=1;
	
	//abstract method-> 뒤에 body가 없음 -> public abstract생략됨
	void turnOn();
	void turnOff();
	public void setVolumne(int volume);

	
	//default method
	// 강제성이 없는 메서드-> 앞에 default를 붙여줘야함
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
		
		
	}
	//static method-> 없어도 됨
	
	static void changeBattery() {
		
		System.out.println("배터리를 교환합니다.");
		
		
	}
	
	
	
	
}
