package Interface1;

public class Tv implements RemoteControl,Searchable{
	
	 private int volume=1;
	 
	@Override
	public void turnOn() {//override->�ݵ�� public���� ����
		System.out.println("tv�Ѷ�");
	}
	
	//volume ����->setVolume-> public
	//�Ҹ��� max���� �� Ŀ���� max�� �������ֱ�
	@Override
	public void setVolumne(int volume) {
		if(RemoteControl.MAX_VOLUME<volume) {
			this.volume=RemoteControl.MAX_VOLUME;}
		else if(RemoteControl.MIN_VOLUME>volume) {
			this.volume=RemoteControl.MIN_VOLUME;}
		else {
			this.volume=volume;
		}
		System.out.println("����tv ����: "+volume);

	}
	
	private String url;
	@Override
	public void search(String url) {
		this.url=url;
		System.out.println("������ ���ۿ�:"+url);
		
	};
}
