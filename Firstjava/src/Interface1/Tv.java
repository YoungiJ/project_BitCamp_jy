package Interface1;

public class Tv implements RemoteControl,Searchable{
	
	 private int volume=1;
	 
	@Override
	public void turnOn() {//override->반드시 public으로 시작
		System.out.println("tv켜랏");
	}
	
	//volume 수정->setVolume-> public
	//소리가 max보다 더 커지면 max로 조정해주기
	@Override
	public void setVolumne(int volume) {
		if(RemoteControl.MAX_VOLUME<volume) {
			this.volume=RemoteControl.MAX_VOLUME;}
		else if(RemoteControl.MIN_VOLUME>volume) {
			this.volume=RemoteControl.MIN_VOLUME;}
		else {
			this.volume=volume;
		}
		System.out.println("현재tv 볼륨: "+volume);

	}
	
	private String url;
	@Override
	public void search(String url) {
		this.url=url;
		System.out.println("집가고 시퍼요:"+url);
		
	};
}
