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
		System.out.println("ä��"+channel+"�� �߼� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB �߼� ������ ����ϴ�.");
	}
	

}
