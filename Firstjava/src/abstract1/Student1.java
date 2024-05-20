package abstract1;

public class Student1 extends LunchMenu{
//객체를 생성
	Student1 stu=new Student1();
//메서드 구현
	public void cal() {
		// price는 상속으로 얻은 애기 때문에 객체 생성안해도 됨
		price=Price.getRice()+Price.getBanana();//클래스에서 접근가능
		System.out.println(price);
		
	}
	
	
}