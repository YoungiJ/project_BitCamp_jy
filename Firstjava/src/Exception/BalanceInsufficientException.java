package Exception;

public class BalanceInsufficientException extends Exception{
	//�Ϲ� ������
	public BalanceInsufficientException() {
		// TODO Auto-generated constructor stub
	}
	//super�� ���� ó�� ������-> message�Ѱܼ�  e.printStackTrace���
	public BalanceInsufficientException(String message) {
			super(message);//? ExceptionŬ�������� message�� ����
			//return���� ��ü�� ����
		
	}

}
