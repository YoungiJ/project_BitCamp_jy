package Generic;

public class Utilori{
	public <T> Box <T> boxing(T t) {
		//ù��°�� ��ȯŸ�� �ι�°�� �Ķ���� Ÿ��
		Box<T> box=new Box<>();
		box.set(t);
		return box;
		
		
	}
}
