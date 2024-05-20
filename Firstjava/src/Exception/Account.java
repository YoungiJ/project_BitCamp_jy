package Exception;


public class Account{
	
	private long balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	//메서드
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance+=money;
		
		
	}
	public void withdraw(int money) throws BalanceInsufficientException{
		// 
		if(balance<money) {
			//객체를 던져버림
			throw new BalanceInsufficientException("잔고부족 "+ (money-balance));
 		}
		balance-=money;
		
	}
	
	
}