package miniProject2;
import java.util.Scanner;

public class SmartPhoneMain {
	
	static String name;//��? ���� �Ǿ� �ְ� ���� �� ����-> �޼��� �ȿ� �����ϴ� �ͺ��� ������ ��Ȱ���� �� ����
	
	public static void main(String[] args) {
	//smartphone �ν��Ͻ� ����
	SmartPhone sm=new SmartPhone();
	Scanner sc=new Scanner(System.in);
	
	//
	while(true) {
		System.out.println("----------�ּ� ���� �޴�----------");
	    System.out.println(">>1.����ó ���");
	    System.out.println(">>2.��� ����ó ���");
	    System.out.println(">>3.����ó �˻�");
	    System.out.println(">>4.����ó ����");
	    System.out.println(">>5.����ó ����");
	    System.out.println(">>6.���α׷� ����");
	    
	    System.out.print("key:");
	    int key=sc.nextInt();

		switch (key) {
		//����ó ���
		case 1:
		    System.out.println("----------------");
			sm.addAddr(sm.inputAddrData());
		    System.out.println("----------------");


			break;
			
		//��� ����ó ���-
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
			sm.deleteArr(name);
			break;
			
		//����ó ����
		case 5:
			System.out.println("�����ϰ����ϴ� �̸��� �Է����ּ���.");
			name=sc.next();
			sm.editArr(name);

			break;
		case 6:
			System.out.println("�ý����� ����Ǿ����ϴ�.");
			System.exit(key);
			break;

		default:
			break;
		}
	}
}
}