package NestedClass;

public class CarEx {
	public static void main(String[]args) {
		
		Car c=new Car();
		c.run1();
		c.run2();
		//��ü�� ���� �־��ֱ�
		c.run3(new Tire() {
		//override
		void roll() {
			System.out.println("�͸�ü4 �� ��������");
		}
			
			
		});
	}
}
