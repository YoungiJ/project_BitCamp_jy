package chpter01;
//smartphone
import java.util.Scanner;
//클래스를 객체로 바꿔버리기
public class SmartPhone {
	//배열정의
	Addr[] ad=new Addr[5];
	Scanner sc=new Scanner(System.in);

	int counter=0;// static으로 받아도 괜찮을듯
	//1.입력받아 객체 생성
	public Addr inputAddrData() {
		//생성하기
		Addr newAddr=new Addr();
	  System.out.print("이름: ");
	    newAddr.setName(sc.nextLine());

	    System.out.print("전화번호: ");
	    newAddr.setPhoneNum(sc.nextLine());

	    System.out.print("이메일: ");
	    newAddr.setEmail(sc.nextLine());

	    System.out.print("주소: ");
	    newAddr.setAddress(sc.nextLine());

	    System.out.print("그룹: ");
	    newAddr.setGroup(sc.nextLine());

		    return newAddr;}
	
	//2.배열에 연락처 객체 저장-> ad[i]안에다가 쏙 넣기
	void addAddr(Addr newAddr) {
		//입력받기
		ad[counter]=newAddr;
		counter++;
	}

	//3. 연락처 출력

	void printAddr(Addr addr) {
	    System.out.println(addr.getName());
	    System.out.println(addr.getPhoneNum());
	    System.out.println(addr.getEmail());
	    System.out.println(addr.getAddress());
	    System.out.println(addr.getGroup());
	}

	//4.모든 연락처 출력
	void printAllAddr() {
	    for (Addr addr : ad) {
	        if (addr != null) {
	            printAddr(addr);
	            System.out.println();
	        }
	    }
	}
	//5.검색
	Addr searchAddr(String name) {
		int i=0;
		while(true){//true로 해도 되지만 -> count를 써도 됨!!!
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				System.out.println("해당 정보를 찾음");
				
			}i++;
		}
		return ad[i] ;
	}
	
	//6. 삭제
	void deleteArr(String name) {

		int i=0;
		int index=0;
		while(true){
				
				if(ad[i]==null) {break;}
				if(ad[i].getName().equals(name)) {
					System.out.println("해당 정보를 찾음2");
					index=i;
				}i++;
			}
		
		//뒤에 있는 배열들을 for문으로 앞으로 땡겨
		for( int j=index;j<ad.length;j++){
			if(ad[j]==null) {break;}
			{ad[j]=ad[j+1];}
			}			
		}

	
	//여기서 counter는 입력받아야할 배열의 인덱스를 나타냄
//	public void deleteAddr(String name) {
//		for(int i=0;i<counter;i++) {
//			
//			if(ad[i].getName().equals(name)) {
//				for(int j=0;i<counter;j++) {
//					ad[j]=ad[j+1];
//				}
//				//다 옮겼으니까 다음 입력받아야할 인덱스를 -1 해주면 배열 크기 조정완
//				counter--;
//				return;
//			}
//		}
//		
//		
//	}

	//7.수정
	void editArr(String name,Addr editAddr) {
		int i=0;
		int index=0;
		while(true){
			
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				System.out.println("해당 정보를 찾음2");
				index=i;
			}i++;
		
		}
		//set
		System.out.print("새이름: ");
		editAddr.setName(sc.nextLine());
		
		System.out.print("새번호: ");
		editAddr.setPhoneNum(sc.nextLine());
		
		System.out.print("새이메일: ");
		editAddr.setEmail(sc.nextLine());
		
		System.out.print("새주소: ");
		editAddr.setAddress(sc.nextLine());
		
		System.out.print("새그룹: ");
		editAddr.setGroup(sc.nextLine());
		
		ad[index]=editAddr;
		
		
		
		
	}
		
}
	

