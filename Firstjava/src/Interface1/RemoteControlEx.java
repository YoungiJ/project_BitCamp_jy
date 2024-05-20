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
		//rc.search("족발집");//아주 좋은 오류입니다.
		tv.search("보쌈집");
		
//		Audio audio=new Audio();
//		audio.setVolumne(11);
//
//		rc=audio;
//		rc.turnOn();
		
		rc.setMute(false);//객체를 통해 접근
		
		RemoteControl.changeBattery();//interface명으로 접근
		
		
//		Searchable searchable=new Tv() ;
//		searchable.search("하잉");
//		System.out.println("리모콘 최대 볼륨"+ RemoteControl.MAX_VOLUME);//인터페이스명으로 접근
	}

}
