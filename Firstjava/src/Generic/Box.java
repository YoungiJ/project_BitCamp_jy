package Generic;

public class Box<T> {
//T는 타입 파라미터
	private T t;//객체 참조변수
	public T get() {//return t
		return t;
	}//설정
	public void set(T t) {this.t=t;}


}
