package chpter01;

public class CarExample {
	public static void main(String[] args) {
		
		
		Car c1=new Car();
		
		for(int i=0;i<7;i++) {
			int problemLocation=c1.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽  koreatire로 교체");
				c1.frontLefTire=new KoreaTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽  금호tire로 교체");
				c1.frontRightTire=new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽  koreatire로 교체");
				c1.BackLefTire=new KoreaTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽  금호tire로 교체");
				c1.BackRightTire=new KumhoTire("뒤오른쪽", 17);
				break;

		
			}
			System.out.println("-----------------------");
		
		}
	}
}
