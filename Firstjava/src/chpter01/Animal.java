package chpter01;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("������");
	};
//�߻�ȭ �޼���� body�� ������ �ʴ´�.
	public abstract void sound();
}
