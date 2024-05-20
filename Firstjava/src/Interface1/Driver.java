package Interface1;

public class Driver {
	

	void drive(Vehicle vehicle) {//매개변수 타입이 interface type-> 구현 객체가 대입될 수 있도록
		vehicle.run();
	}
}