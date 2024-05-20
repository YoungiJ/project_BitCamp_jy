package chpter01;


public class Car {
	Tire frontLefTire=new Tire("앞왼", 6);
	Tire frontRightTire=new Tire("앞오", 2);
	Tire BackLefTire=new Tire("뒤왼", 3);
	Tire BackRightTire=new Tire("뒤오", 4);
	
	
	//run method
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLefTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(BackLefTire.roll()==false) {stop();return 3;}
		if(BackRightTire.roll()==false) {stop();return 4;}
		return 0;
	}
	
	//stop method
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
