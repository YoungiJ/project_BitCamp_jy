package miniProject2.copy;
import java.util.Scanner;


public class SmartPhoneMain {
	
	static String name;
	
	public static void main(String[] args) throws InputException  {
		SmartPhone sm=new SmartPhone();
		Scanner sc=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("----------�ּ� ���� �޴�----------");
		    System.out.println(">>1.����ó �Է�");
		    System.out.println(">>2.��� ����ó ���");
		    System.out.println(">>3.����ó �˻�");
		    System.out.println(">>4.����ó ����");
		    System.out.println(">>5.����ó ����");
		    System.out.println(">>6.�̸�+����ó�� ���");
		    System.out.println(">>7.���α׷� ����");
		    
		    System.out.print("key:");
		    int key=sc.nextInt();
	
			switch (key) {
			//����ó ���
			case 1:
			    System.out.println("----------------");
			   
				Addr addr = null;
			
				addr = sm.inputAddrRealData();
				
		    	sm.addAddr(addr);

	public ClientAddr(String name, String phoneNum, String email, String addr, String group,String clientName,String tradingItem,String position) {
		super(name,phoneNum,email,addr,group,clientName,tradingItem,position);			    
			    System.out.println("----------------");

			//��� ����ó ���
			case 2:
				sm.printAllAddr();
				break;
				
			//����ó �˻�
			case 3:
			    System.out.println("�˻��ϰ����ϴ� �̸��� �Է����ּ���");
				name=sc.next();
				sm.searchAddr(name);
				break;
				
			//����ó ����
			case 4:
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���.");
				name=sc.next();
				sm.deleteAddr(name);
				break;
				
			//����ó ����
			case 5:
				System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���.");
				name=sc.next();
				sm.searchAddr(name);
				sm.editArr(name,sm.inputAddrRealData());
				break;
				
			//�̸�+����ó�� ���
			case 6:
				System.out.println("�̸�+����ó�� ���");
				sm.printContact();
				break;
				
			//�̸�+����ó�� ���	
			case 7:
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				System.exit(key);
				break;
	
			default:
				break;
			}
		}
	}
}