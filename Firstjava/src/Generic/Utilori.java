package Generic;

public class Utilori{
	public <T> Box <T> boxing(T t) {
		//첫번째는 반환타입 두번째는 파라미터 타입
		Box<T> box=new Box<>();
		box.set(t);
		return box;
		
		
	}
}
