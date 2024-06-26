package miniProject2.copy;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.sun.javadoc.ThrowsTag;

import miniProject2.ClientAddr;
import miniProject2.CompanyAddr;
import miniProject2.DuplicateException;




public class SmartPhone {
	
	String companyName;
	String departName;
	String position;
	String clientName;
	String tradingItem;
	int counter=0;
	
	Addr[] ad=new Addr[10];
	Scanner sc=new Scanner(System.in);
	

    public void inputAddrData() {
    	try {
    		Addr addr=inputAddrRealData();
    		{}
			
		} catch (InputException e) {
			// TODO: handle exception
			
		}
    	
    	
    	
    }
	//2.연락처 이름 입력시에 공백에 대한 예외처리
	//3.영어와 한글만 허용하는 예외처리
  	public boolean checkName(String name) {
		
	 	if(name.length()!=name.trim().length()|| !((byte)name.length()==2||(byte)name.length()==3)) {
        	throw new InputException("inputException.");
        }
		if(!name.matches("[a-zA-Z가-힣]+")) {
        	throw new InputException("inputException.");
	    }
		
	}
  //4.전화번호 형식에 맞지 않을때에 대한 예외처리
  //5.전화번호가 중복처리 될때 예외처리
  	public boolean checkphoneNum(String phoneNum) {
		String regex = "010-\\d{4}-\\d{4}";
		boolean isMatch=Pattern.matches(regex,phoneNum);

  		if(!isMatch) {
  			throw new InputException("inputException.");
  		}
  		for(Addr addr:ad) {
  			if(!phoneNum.equals(addr.getPhoneNum())){
  	  			throw new InputException("inputException.");
  	  		}
  		}
		
  		
  	}
	
    //1.메뉴 입력시 발생할 수 있는 예외
    public Addr inputAddrRealData() {
    	try {
    		
    		
    	System.out.print("이름: ");
        String name = sc.nextLine();
        checkName(name);
       
        System.out.print("전화번호: ");
        String phoneNum = sc.nextLine();
        checkphoneNum(phoneNum);
        System.out.print("이메일: ");
        String email = sc.nextLine();

        System.out.print("주소: ");
        String address = sc.nextLine();

        System.out.print("그룹(company/client 중 선택): ");
        String groupChoice = sc.nextLine();

        if (groupChoice.equals("company")) {
            System.out.print("회사 이름: ");
            String companyName = sc.nextLine();

            System.out.print("부서 이름: ");
            String departName = sc.nextLine();

            System.out.print("직무: ");
            String position = sc.nextLine();
            return new Addr(name, phoneNum, email, address, groupChoice, companyName, departName, position);


        } else if (groupChoice.equals("client")) {
            System.out.print("고객 이름: ");
            String clientName = sc.nextLine();

            System.out.print("상품 품목: ");
            String tradingItem = sc.nextLine();

            System.out.print("직무: ");
            String position2 = sc.nextLine();
            return new Addr(name, phoneNum, email, address, groupChoice, clientName, tradingItem, position2);


        } else {
            System.out.println("잘못된 그룹을 선택하셨습니다. 다시 입력해주세요.");
        }
        
		}catch (Exception e) {
			// TODO: handle exception
			throw new InputException(" 입력시 발생할 수 있는 예외.");

		}
    	
    	
    }
	  


		
	//2.배열에 연락처 객체 저장
	void addAddr(Addr newAddr) {
		//입력받기
		ad[counter]=newAddr;
		counter++;
	}
  // 3. 연락처 출력
    void printAddr(Addr addr) {
        System.out.println(addr.getName());
        System.out.println(addr.getPhoneNum());
        System.out.println(addr.getEmail());
        System.out.println(addr.getAddress());
        System.out.println(addr.getGroup());
    }

	//3.연락처 출력
	public void printContact() {
	    System.out.print("찾는 이름: ");
	    String name = sc.next();
	    
	    Addr newAddr = searchAddr(name);

	    if (newAddr != null) {
	        newAddr.showData();
	    } else {
	        System.out.println("주소록에서 '" + name + "'에 해당하는 정보를 찾을 수 없습니다.");
	    }
	}


	//4.모든 연락처 출력
		public void printAllAddr() {
			for (int i = 0; i < counter;i++) {
				if(ad[i]!=null) {
				ad[i].showData();}
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
//				ad[i].showData();
				
			}i++;
		}
		return ad[i] ;
	}
	
	//6. 삭제
		public void deleteAddr(String name) {
		for(int i=0;i<counter;i++) {
			
			if(ad[i].getName().equals(name)) {
				for(int j=0;i<counter;j++) {
					ad[j]=ad[j+1];
				}
				//다 옮겼으니까 다음 입력받아야할 인덱스를 -1 해주면 배열 크기 조정완
				counter--;
				return;
			}
		}
		
		
	}

	//7.수정
	void editArr(String name,Addr newAddr) {
		int i=0;
		while(true){
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				ad[i]=newAddr;

			}i++;
		}

	}

	}}
	
	


	



