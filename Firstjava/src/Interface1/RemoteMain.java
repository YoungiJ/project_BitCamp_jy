package Interface1;

public class RemoteMain {
	
	public static void main(String[]args) {
		
		
		
		RemoteControl rc;
		rc=new Tv();
		rc.turnOn();
		
		rc=new Audio();
		rc.turnOn();
		//익명 객체 생성
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
//				System.out.println(volume+"을 높이세요");
//
//			}
//		};
//		//위에서 override한 메서드 활용
//		remote.turnOn();
//		remote.turnOff();
//		remote.setMute(true);// 원래는 false로 선언되어 있음
//		RemoteControl.changeBattery();//static이기 때문에 클래스.메서드
//		
		
		
	}
	

}
