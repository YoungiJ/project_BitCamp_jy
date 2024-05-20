package Exception;

public class AccountEx {
	public static void main(String[]args) {
		Account account=new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액"+account.getBalance());
		//출금하기
		try {
			account.withdraw(20000);
		}
		catch(BalanceInsufficientException e){
			String message=e.getMessage();//runtimeexception class의 getMessage
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			
		}
		
		
	
		
		
	}
}
