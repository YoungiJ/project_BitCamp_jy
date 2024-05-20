package Exception;

public class AccountEx {
	public static void main(String[]args) {
		Account account=new Account();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�"+account.getBalance());
		//����ϱ�
		try {
			account.withdraw(20000);
		}
		catch(BalanceInsufficientException e){
			String message=e.getMessage();//runtimeexception class�� getMessage
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			
		}
		
		
	
		
		
	}
}
