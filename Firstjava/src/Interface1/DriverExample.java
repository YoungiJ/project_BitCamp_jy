package Interface1;

public class DriverExample {
	public static void main(String[]args) {
	//method
		
		
		//driver 객체 생성
		Driver driver=new Driver();
		
		//구현 객체 만들기
		Bus bus=new Bus();	

		
		//매개값으로 구현객체를 태입->자동 타입 변환->  다형성때문에 실행 결과가 다름
		driver.drive(bus);

	
	}

}



//
//void drive(Vehicle vehicle) {//매개변수 타입이 interface type-> 구현 객체가 대입될 수 있도록
//	vehicle.run();
//}