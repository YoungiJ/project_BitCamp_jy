//package Interface1;
//
//public class Audio implements RemoteControl {
//	 private int volume=1;
//	@Override
//	public void turnOn() {
//		System.out.println("audio �Ѷ�");
//	}
//	
//	//volume ����->setVolume-> public
//	//�Ҹ��� max���� �� Ŀ���� max�� �������ֱ�
//	@Override
//	public void setVolumne(int volume) {
//		if(RemoteControl.MAX_VOLUME<volume) {
//			this.volume=RemoteControl.MAX_VOLUME;}
//		else if(RemoteControl.MIN_VOLUME>volume) {
//			this.volume=RemoteControl.MIN_VOLUME;}
//		else {
//			this.volume=volume;
//		}
//		System.out.println("���� audio ����: "+this.volume);
//	}
//	
//	//default�޼��� override
//	
//	private int memory;// �߰� �ʵ� ����
//	@Override
//	public void setMute(boolean mute) {
//		if(mute) {
//			this.memory=this.volume;
//			System.out.println("���� ó�� �����ڰ�");
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
