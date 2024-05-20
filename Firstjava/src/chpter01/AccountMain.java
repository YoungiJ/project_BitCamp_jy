package chpter01;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력받기
		Scanner scanner=new Scanner(System.in);
		
		//객체 생성
		System.out.println("계좌 정보를 입력하세요:");
		System.out.print("계좌 명의:");
		String name=scanner.next();
		System.out.print("계좌 번호:");
		String no=scanner.next();

		System.out.print("잔고:");
		Long balance=scanner.nextLong();

		Account account=new Account(name,no,balance);
		System.out.println();
		System.out.println("기본 정보: "+account.getName()+'\n'+account.getNo()+'\n'+account.getBalance());
//method 사용 , get해서 balance 얻기

	
		System.out.print("출금액: ");
		long k=scanner.nextLong();
		System.out.println();

		account.deposit(k);
		System.out.println("잔금:"+account.getBalance()+"입니다.");
		scanner.close();
}

}
