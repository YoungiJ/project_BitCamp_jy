package chpter01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model,String color,int channel) {
		// TODO Auto-generated constructor stub

//		super("black",color,channel);
		this.model=model;
		this.color=color;
		this.channel=channel;
	
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 발송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 발송 수신을 멈춥니다.");
	}
	

}
