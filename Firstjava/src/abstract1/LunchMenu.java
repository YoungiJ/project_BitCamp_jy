package abstract1;
//부모 클래스로 사용하는데 얘 자체로 new는 못함
public abstract class LunchMenu extends Price{	
	//필드
	public int price;
	//생성자
	LunchMenu(){
		super();
	}
	//추상 메서드
	public abstract void cal();


}