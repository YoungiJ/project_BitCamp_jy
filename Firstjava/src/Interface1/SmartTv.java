package Interface1;

public class SmartTv implements RemoteControl,Searchable {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("�Ѽ�");
		
	};
	public void turnOff() {
		System.out.println("����");

		
	};
	public void setVolumne(int volume) {
		if(MAX_VOLUME<volume) {
			this.volume=MAX_VOLUME;
			
		}
		else {
			this.volume=volume;
		}
		
	};
	
	
	public void search(String url) {
		System.out.println(url+" : ã��");
		
	};

	
	

}
