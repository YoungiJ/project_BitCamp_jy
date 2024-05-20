package miniProject2;
//smartphone
import java.util.Scanner;

//클래스를 객체로 바꿔버리기
public class SmartPhone {
	
	//배열객체 정의

	Addr[] ad=new Addr[4];
	Scanner sc=new Scanner(System.in);
	
	String companyName;
	String departName;
	String position;
	String clientName;
	String tradingItem;
	
	int counter=0;// static으로 받아도 괜찮을듯
	//1.입력받아 객체 생성
	public Addr inputAddrData() {
		
		//생성하기
		
		System.out.print("이름: ");
	  	String name=sc.nextLine();
	  	
	    System.out.print("전화번호: ");
	    String phoneNum =sc.nextLine();

	    System.out.print("이메일: ");
	    String email=sc.nextLine();

	    System.out.print("주소: ");
	    String address=sc.nextLine();

	    System.out.print("그룹: ");
	    String groupChoice=sc.nextLine();

	    Addr newAddr=new Addr(name,phoneNum,email,address,groupChoice);
    	System.out.println(newAddr);

	    
	    if(groupChoice.equals("company")){
		    System.out.print("회사 이름: ");
		    companyName=sc.nextLine();
		    
		    System.out.print("부서 이름: ");
		    departName=sc.nextLine();
		    
		    System.out.print("직무: ");
		    position=sc.nextLine();

	    	newAddr=new CompanyAddr(name,phoneNum,email,address,groupChoice,companyName,departName,position);
	    	System.out.println(newAddr);
	    	newAddr.setGroup(groupChoice);

	    }else if(groupChoice.equals("customer")){
		    System.out.print("고객 이름: ");
	    	clientName=sc.nextLine();
		    
		    System.out.print("상품 품목: ");
		    tradingItem=sc.nextLine();
		    
		    System.out.print("직무: ");
		    position=sc.nextLine();
		    
	    	newAddr=new CustomerAddr(name,phoneNum,email,address,groupChoice,clientName,tradingItem,position);
	    	newAddr.setGroup(groupChoice);
	    	
	    }
		    return newAddr;}
	
	//2.배열에 연락처 객체 저장-> ad[i]안에다가 쏙 넣기
	void addAddr(Addr newAddr) {
		//입력받기
		ad[counter]=newAddr;
		counter++;
	}

	//3. 연락처 출력


//	4.모든 연락처 출력
	//모든 연락처 출력
		public void printAllAddr() {
			for (int i = 0; i < counter;i++) {
				if(ad[i]!=null) {
				ad[i].printAddr();}
			}
		}
		
		


	//5.검색
	public Addr searchAddr(String name) {
		int i=0;
		while(true){//true로 해도 되지만 -> count를 써도 됨!!!
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				//ad의 이름을 가진 배열 ad[i]
				System.out.println("해당 정보를 찾음");
				ad[i].printAddr();
				
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
	void editArr(String name) {
		int i=0;
		while(true){
			
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				System.out.println("해당 정보를 찾음2");
				ad[i]=inputAddrData();

			}i++;
		}

	}
		
}
	

