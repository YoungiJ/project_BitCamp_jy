package chpter01;

public class CarExample {
	public static void main(String[] args) {
		
		
		Car c1=new Car();
		
		for(int i=0;i<7;i++) {
			int problemLocation=c1.run();
			switch (problemLocation) {
			case 1:
				System.out.println("�տ���  koreatire�� ��ü");
				c1.frontLefTire=new KoreaTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ�����  ��ȣtire�� ��ü");
				c1.frontRightTire=new KumhoTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ���  koreatire�� ��ü");
				c1.BackLefTire=new KoreaTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ�����  ��ȣtire�� ��ü");
				c1.BackRightTire=new KumhoTire("�ڿ�����", 17);
				break;

		
			}
			System.out.println("-----------------------");
		
		}
	}
}
