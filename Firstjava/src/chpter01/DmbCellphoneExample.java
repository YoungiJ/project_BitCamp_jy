package chpter01;

public class DmbCellphoneExample {
	public static void main(String[]args) {
		
		DmbCellPhone dmb=new DmbCellPhone("������", "����", 20);
		
		
		System.out.println("��:"+dmb.model);
		System.out.println("����:"+dmb.color);
		System.out.println("ä��:"+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ���");
		dmb.sendVoice("�ݰ�����");
		dmb.hangUp();
		
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
		
	}

}
