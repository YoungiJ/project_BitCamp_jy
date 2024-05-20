package NestedClass;

public class CarEx {
	public static void main(String[]args) {
		
		Car c=new Car();
		c.run1();
		c.run2();
		//객체를 만들어서 넣어주기
		c.run3(new Tire() {
		//override
		void roll() {
			System.out.println("익명객체4 가 굴러가요");
		}
			
			
		});
	}
}
