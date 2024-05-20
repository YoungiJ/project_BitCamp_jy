package miniProject2;

public class ClientAddr extends Addr {
	String clientName;
	String tradingItem;
	String position;
	
	public ClientAddr(String name, String phoneNum, String email, String addr, String group,String clientName,String tradingItem,String position) {
		super(name,phoneNum,email,addr,group);
		this.clientName=clientName;
		this.tradingItem=tradingItem;
		this.position=position;
	}
	public String getClientName() {
		return clientName;
	}
	public String getTradingItem() {
		return tradingItem;
	}
	public String getPosition() {
		return position;
	}
	
	public void setclientName(String clientName) {
		this.clientName=clientName;
	}
	public void setTradingItem(String tradingItem) {
		this.tradingItem=tradingItem;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	@Override
	public void showData() {
		System.out.println("--------------------------------------");
		System.out.println("�̸� : " + super.getName());
		System.out.println("��ȭ��ȣ : " + super.getPhoneNum());
		System.out.println("�̸��� : " + super.getEmail());
		System.out.println("�ּ� : " + super.getAddress());
		System.out.println("�׷�(client/client) : " + super.getGroup());
		System.out.println("�ŷ�ó �̸� : " + clientName);
		System.out.println("�ŷ�ǰ�� : " + tradingItem);
		System.out.println("���� : " + position);		
		System.out.println("--------------------------------------");
	}	
}

