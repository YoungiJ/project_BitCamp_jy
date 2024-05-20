package miniProject2;
import java.util.Scanner;

public class SmartPhoneMain {
	
	static String name;//왜? 선언만 되어 있고 값은 안 넣음-> 메서드 안에 생성하는 것보다 여러번 재활용할 수 있음
	
	public static void main(String[] args) {
	//smartphone 인스턴스 생성
	SmartPhone sm=new SmartPhone();
	Scanner sc=new Scanner(System.in);
	
	//
	while(true) {
		System.out.println("----------주소 관리 메뉴----------");
	    System.out.println(">>1.연락처 등록");
	    System.out.println(">>2.모든 연락처 출력");
	    System.out.println(">>3.연락처 검색");
	    System.out.println(">>4.연락처 삭제");
	    System.out.println(">>5.연락처 수정");
	    System.out.println(">>6.프로그램 종료");
	    
	    System.out.print("key:");
	    int key=sc.nextInt();

		switch (key) {
		//연락처 등록
		case 1:
		    System.out.println("----------------");
			sm.addAddr(sm.inputAddrData());
		    System.out.println("----------------");


			break;
			
		//모든 연락처 출력-
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
			sm.deleteArr(name);
			break;
			
		//연락처 수정
		case 5:
			System.out.println("수정하고자하는 이름을 입력해주세요.");
			name=sc.next();
			sm.editArr(name);

			break;
		case 6:
			System.out.println("시스템이 종료되었습니다.");
			System.exit(key);
			break;

		default:
			break;
		}
	}
}
}