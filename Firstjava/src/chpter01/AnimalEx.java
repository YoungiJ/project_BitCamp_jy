package chpter01;

public class AnimalEx {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("----");
		
		Animal animal;
		//�ڵ� ����ȯ
		animal=new Dog();
		animal.sound();
		
		
		animal=new Cat();
		animal.sound();

		//������
		
	}

}
