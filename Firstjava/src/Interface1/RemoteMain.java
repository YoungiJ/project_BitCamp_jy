package Interface1;

public class RemoteMain {
	
	public static void main(String[]args) {
		
		
		
		RemoteControl rc;
		rc=new Tv();
		rc.turnOn();
		
		rc=new Audio();
		rc.turnOn();
		//�͸� ��ü ����
//		RemoteControl remote=new RemoteControl() {
//			
//			@Override
//			public void turnOn() {
//				// TODO Auto-generated method stub
//				System.out.println("turn on");
//			}
//			
//			@Override
//			public void turnOff() {
//				// TODO Auto-generated method stub
//				System.out.println("turn off");
//
//			}
//			
//			@Override
//			public void setVolume(int volume) {
//				// TODO Auto-generated method stub
//				System.out.println(volume+"�� ���̼���");
//
//			}
//		};
//		//������ override�� �޼��� Ȱ��
//		remote.turnOn();
//		remote.turnOff();
//		remote.setMute(true);// ������ false�� ����Ǿ� ����
//		RemoteControl.changeBattery();//static�̱� ������ Ŭ����.�޼���
//		
		
		
	}
	

}
