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
		System.out.println("이름 : " + super.getName());
		System.out.println("전화번호 : " + super.getPhoneNum());
		System.out.println("이메일 : " + super.getEmail());
		System.out.println("주소 : " + super.getAddress());
		System.out.println("그룹(client/client) : " + super.getGroup());
		System.out.println("거래처 이름 : " + clientName);
		System.out.println("거래품목 : " + tradingItem);
		System.out.println("직급 : " + position);		
		System.out.println("--------------------------------------");
	}	
}

