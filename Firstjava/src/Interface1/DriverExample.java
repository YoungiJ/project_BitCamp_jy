package Interface1;

public class DriverExample {
	public static void main(String[]args) {
	//method
		
		
		//driver ��ü ����
		Driver driver=new Driver();
		
		//���� ��ü �����
		Bus bus=new Bus();	

		
		//�Ű������� ������ü�� ����->�ڵ� Ÿ�� ��ȯ->  ������������ ���� ����� �ٸ�
		driver.drive(bus);

	
	}

}



//
//void drive(Vehicle vehicle) {//�Ű����� Ÿ���� interface type-> ���� ��ü�� ���Ե� �� �ֵ���
//	vehicle.run();
//}