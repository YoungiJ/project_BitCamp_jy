package Interface1;

public class RemoteControlEx {
	public static void main(String[]args) {
		
		RemoteControl rc;
		SmartTv tv=new SmartTv();
		tv.setVolumne(0);
		rc=tv;
		rc.turnOn();
		rc.setVolumne(22);
		rc.turnOff();
		//rc.search("������");//���� ���� �����Դϴ�.
		tv.search("������");
		
//		Audio audio=new Audio();
//		audio.setVolumne(11);
//
//		rc=audio;
//		rc.turnOn();
		
		rc.setMute(false);//��ü�� ���� ����
		
		RemoteControl.changeBattery();//interface������ ����
		
		
//		Searchable searchable=new Tv() ;
//		searchable.search("����");
//		System.out.println("������ �ִ� ����"+ RemoteControl.MAX_VOLUME);//�������̽������� ����
	}

}
