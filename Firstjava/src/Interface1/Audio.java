//package Interface1;
//
//public class Audio implements RemoteControl {
//	 private int volume=1;
//	@Override
//	public void turnOn() {
//		System.out.println("audio 켜랏");
//	}
//	
//	//volume 수정->setVolume-> public
//	//소리가 max보다 더 커지면 max로 조정해주기
//	@Override
//	public void setVolumne(int volume) {
//		if(RemoteControl.MAX_VOLUME<volume) {
//			this.volume=RemoteControl.MAX_VOLUME;}
//		else if(RemoteControl.MIN_VOLUME>volume) {
//			this.volume=RemoteControl.MIN_VOLUME;}
//		else {
//			this.volume=volume;
//		}
//		System.out.println("현재 audio 볼륨: "+this.volume);
//	}
//	
//	//default메서드 override
//	
//	private int memory;// 추가 필드 선언
//	@Override
//	public void setMute(boolean mute) {
//		if(mute) {
//			this.memory=this.volume;
//			System.out.println("무음 처리 가보자고");
//			setVolumne(2);
//			
//		}
//		else{
//			setVolumne(this.memory);
//			
//		};
//		
//		
//	}
//}
