package chpter01;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨쉬기");
	};
//추상화 메서드는 body를 만들지 않는다.
	public abstract void sound();
}
