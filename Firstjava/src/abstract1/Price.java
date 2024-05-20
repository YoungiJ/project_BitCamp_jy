package abstract1;

public class Price {
	//가격을 가져와야함-> static final
	private static final int RICE=1000;//
	
	
	private static final int MILK=2000;//
	private static final int BANANA=3000;//
	
	//생성자로 호출할때 객체에 올라갔으면 좋겠어-> 생성자에서 선언
	//현재는 static에 올라가서 자유롭게 사용하는 것이 더 나음
	
	Price(){
	
		
	}
	
	public static int getRice() {
		return RICE;
	}
	public static int getBanana() {
		return BANANA;
	}
	public static int getMilk() {
		return MILK;}
}
