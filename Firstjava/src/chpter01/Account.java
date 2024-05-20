package chpter01;

public class Account {
	private String name;
	private String no;
	private long balance;
	
	
	//생성자 - 매개변수가 다르니까 this를 쓸 이유가 없음
	public Account(String n,String num,long z){
		name=n;
		no=num;
		balance=z;
		
	}
	
	//get-> public으로 짜야지 접근할 수 있음
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public long getBalance() {
		return balance;
	}
	
	//method
	void deposit(long k) {
		balance-=k;
		
	}

}
