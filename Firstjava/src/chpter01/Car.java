package chpter01;


public class Car {
	Tire frontLefTire=new Tire("�տ�", 6);
	Tire frontRightTire=new Tire("�տ�", 2);
	Tire BackLefTire=new Tire("�ڿ�", 3);
	Tire BackRightTire=new Tire("�ڿ�", 4);
	
	
	//run method
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLefTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(BackLefTire.roll()==false) {stop();return 3;}
		if(BackRightTire.roll()==false) {stop();return 4;}
		return 0;
	}
	
	//stop method
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
}
