package chpter01;

public class Account {
	private String name;
	private String no;
	private long balance;
	
	
	//������ - �Ű������� �ٸ��ϱ� this�� �� ������ ����
	public Account(String n,String num,long z){
		name=n;
		no=num;
		balance=z;
		
	}
	
	//get-> public���� ¥���� ������ �� ����
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
