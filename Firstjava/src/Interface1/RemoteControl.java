package Interface1;

public interface RemoteControl {
	//interface�� �ڵ����� static final ����� ������
	// �빮��_ �� �����ϱ�
	int MAX_VOLUME=10;
	int MIN_VOLUME=1;
	
	//abstract method-> �ڿ� body�� ���� -> public abstract������
	void turnOn();
	void turnOff();
	public void setVolumne(int volume);

	
	//default method
	// �������� ���� �޼���-> �տ� default�� �ٿ������
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
		
		
	}
	//static method-> ��� ��
	
	static void changeBattery() {
		
		System.out.println("���͸��� ��ȯ�մϴ�.");
		
		
	}
	
	
	
	
}
