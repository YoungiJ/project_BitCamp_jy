package chpter01;

public class Dog extends Animal {
	
	
	//������
	public Dog() {
		//super
		this.kind="Cat";
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("bow wow");
		
	}
}
