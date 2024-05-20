package chpter01;

public class StoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//본점
		MainStore m=new MainStore();
		System.out.println("본점");
		m.print();
		System.out.println("========================");

		//첫번째 집
		
//		MainStore m1=new FirstStore();//이렇게 하면 기본 생성자가 없어서 생성안됨
		MainStore m1=new FirstStore("7000","8000","12000","판매하지 않습니다.","1000");
		System.out.println("매장 1호점");
		m1.print();
		System.out.println("========================");
		//두번째 집
//		MainStore m2=new SecondStore("5000","5000","10000","3000","무료입니다.");
		
		MainStore m2=new SecondStore("23", "23","23");
		System.out.println("매장 2호점");
		m2.print();
		System.out.println("========================");

		
		MainStore m3=new ThirdStore("7000","7000","12000","3000","1000");
		System.out.println("매장 3호점");
		m3.print();

	}

}
