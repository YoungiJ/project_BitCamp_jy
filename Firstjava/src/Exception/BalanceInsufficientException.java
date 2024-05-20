package Exception;

public class BalanceInsufficientException extends Exception{
	//일반 생성자
	public BalanceInsufficientException() {
		// TODO Auto-generated constructor stub
	}
	//super로 예외 처리 생성자-> message넘겨서  e.printStackTrace사용
	public BalanceInsufficientException(String message) {
			super(message);//? Exception클래스에게 message를 보냄
			//return으로 객체를 생성
		
	}

}
