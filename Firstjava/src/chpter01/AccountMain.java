package chpter01;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Է¹ޱ�
		Scanner scanner=new Scanner(System.in);
		
		//��ü ����
		System.out.println("���� ������ �Է��ϼ���:");
		System.out.print("���� ����:");
		String name=scanner.next();
		System.out.print("���� ��ȣ:");
		String no=scanner.next();

		System.out.print("�ܰ�:");
		Long balance=scanner.nextLong();

		Account account=new Account(name,no,balance);
		System.out.println();
		System.out.println("�⺻ ����: "+account.getName()+'\n'+account.getNo()+'\n'+account.getBalance());
//method ��� , get�ؼ� balance ���

	
		System.out.print("��ݾ�: ");
		long k=scanner.nextLong();
		System.out.println();

		account.deposit(k);
		System.out.println("�ܱ�:"+account.getBalance()+"�Դϴ�.");
		scanner.close();
}

}
