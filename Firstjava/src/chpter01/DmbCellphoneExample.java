package chpter01;

public class DmbCellphoneExample {
	public static void main(String[]args) {
		
		DmbCellPhone dmb=new DmbCellPhone("아이폰", "검정", 20);
		
		
		System.out.println("모델:"+dmb.model);
		System.out.println("색상:"+dmb.color);
		System.out.println("채널:"+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요");
		dmb.sendVoice("반가워요");
		dmb.hangUp();
		
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
		
	}

}
