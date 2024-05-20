package miniProject2;

public class CustomerAddr extends Addr {
	String clientName;
	String tradingItem;
	String position;
	
	public CustomerAddr(String name, String phoneNum, String email, String addr, String group,String clientName,String tradingItem,String position) {
		// TODO Auto-generated constructor stu
		super(name,phoneNum,email,addr,group);
		this.clientName=clientName;
		this.tradingItem=tradingItem;
		this.position=position;
		
		
	}
	@Override
	public void printAddr() {
		System.out.println("--------------------------------------");
		System.out.println("�̸� : " + super.getName());
		System.out.println("��ȭ��ȣ : " + super.getPhoneNum());
		System.out.println("�̸��� : " + super.getEmail());
		System.out.println("�ּ� : " + super.getAddress());
		System.out.println("�׷�(ģ��/����) : " + super.getGroup());
		System.out.println("�ŷ�ó �̸� : " + clientName);
		System.out.println("�ŷ�ǰ�� : " + tradingItem);
		System.out.println("���� : " + position);		
		System.out.println("--------------------------------------");
	}	
	

}

