package miniProject2.copy;
import java.util.Scanner;


public class SmartPhoneMain {
	
	static String name;
	
	public static void main(String[] args) throws InputException  {
		SmartPhone sm=new SmartPhone();
		Scanner sc=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("----------주소 관리 메뉴----------");
		    System.out.println(">>1.연락처 입력");
		    System.out.println(">>2.모든 연락처 출력");
		    System.out.println(">>3.연락처 검색");
		    System.out.println(">>4.연락처 삭제");
		    System.out.println(">>5.연락처 수정");
		    System.out.println(">>6.이름+연락처만 출력");
		    System.out.println(">>7.프로그램 종료");
		    
		    System.out.print("key:");
		    int key=sc.nextInt();
	
			switch (key) {
			//연락처 등록
			case 1:
			    System.out.println("----------------");
			   
				Addr addr = null;
			
				addr = sm.inputAddrRealData();
				
		    	sm.addAddr(addr);

	public ClientAddr(String name, String phoneNum, String email, String addr, String group,String clientName,String tradingItem,String position) {
		super(name,phoneNum,email,addr,group,clientName,tradingItem,position);			    
			    System.out.println("----------------");

			//모든 연락처 출력
			case 2:
				sm.printAllAddr();
				break;
				
			//연락처 검색
			case 3:
			    System.out.println("검색하고자하는 이름을 입력해주세요");
				name=sc.next();
				sm.searchAddr(name);
				break;
				
			//연락처 삭제
			case 4:
				System.out.println("삭제하고자하는 이름을 입력해주세요.");
				name=sc.next();
				sm.deleteAddr(name);
				break;
				
			//연락처 수정
			case 5:
				System.out.println("수정하고자하는 이름을 입력해주세요.");
				name=sc.next();
				sm.searchAddr(name);
				sm.editArr(name,sm.inputAddrRealData());
				break;
				
			//이름+연락처만 출력
			case 6:
				System.out.println("이름+연락처만 출력");
				sm.printContact();
				break;
				
			//이름+연락처만 출력	
			case 7:
				System.out.println("시스템이 종료되었습니다.");
				System.exit(key);
				break;
	
			default:
				break;
			}
		}
	}
}