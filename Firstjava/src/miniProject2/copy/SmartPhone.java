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
	//2.����ó �̸� �Է½ÿ� ���鿡 ���� ����ó��
	//3.����� �ѱ۸� ����ϴ� ����ó��
  	public boolean checkName(String name) {
		
	 	if(name.length()!=name.trim().length()|| !((byte)name.length()==2||(byte)name.length()==3)) {
        	throw new InputException("inputException.");
        }
		if(!name.matches("[a-zA-Z��-�R]+")) {
        	throw new InputException("inputException.");
	    }
		
	}
  //4.��ȭ��ȣ ���Ŀ� ���� �������� ���� ����ó��
  //5.��ȭ��ȣ�� �ߺ�ó�� �ɶ� ����ó��
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
	
    //1.�޴� �Է½� �߻��� �� �ִ� ����
    public Addr inputAddrRealData() {
    	try {
    		
    		
    	System.out.print("�̸�: ");
        String name = sc.nextLine();
        checkName(name);
       
        System.out.print("��ȭ��ȣ: ");
        String phoneNum = sc.nextLine();
        checkphoneNum(phoneNum);
        System.out.print("�̸���: ");
        String email = sc.nextLine();

        System.out.print("�ּ�: ");
        String address = sc.nextLine();

        System.out.print("�׷�(company/client �� ����): ");
        String groupChoice = sc.nextLine();

        if (groupChoice.equals("company")) {
            System.out.print("ȸ�� �̸�: ");
            String companyName = sc.nextLine();

            System.out.print("�μ� �̸�: ");
            String departName = sc.nextLine();

            System.out.print("����: ");
            String position = sc.nextLine();
            return new Addr(name, phoneNum, email, address, groupChoice, companyName, departName, position);


        } else if (groupChoice.equals("client")) {
            System.out.print("�� �̸�: ");
            String clientName = sc.nextLine();

            System.out.print("��ǰ ǰ��: ");
            String tradingItem = sc.nextLine();

            System.out.print("����: ");
            String position2 = sc.nextLine();
            return new Addr(name, phoneNum, email, address, groupChoice, clientName, tradingItem, position2);


        } else {
            System.out.println("�߸��� �׷��� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
        }
        
		}catch (Exception e) {
			// TODO: handle exception
			throw new InputException(" �Է½� �߻��� �� �ִ� ����.");

		}
    	
    	
    }
	  


		
	//2.�迭�� ����ó ��ü ����
	void addAddr(Addr newAddr) {
		//�Է¹ޱ�
		ad[counter]=newAddr;
		counter++;
	}
  // 3. ����ó ���
    void printAddr(Addr addr) {
        System.out.println(addr.getName());
        System.out.println(addr.getPhoneNum());
        System.out.println(addr.getEmail());
        System.out.println(addr.getAddress());
        System.out.println(addr.getGroup());
    }

	//3.����ó ���
	public void printContact() {
	    System.out.print("ã�� �̸�: ");
	    String name = sc.next();
	    
	    Addr newAddr = searchAddr(name);

	    if (newAddr != null) {
	        newAddr.showData();
	    } else {
	        System.out.println("�ּҷϿ��� '" + name + "'�� �ش��ϴ� ������ ã�� �� �����ϴ�.");
	    }
	}


	//4.��� ����ó ���
		public void printAllAddr() {
			for (int i = 0; i < counter;i++) {
				if(ad[i]!=null) {
				ad[i].showData();}
			}
		}
		

	//5.�˻�
	public Addr searchAddr(String name) {
		int i=0;
		while(true){//true�� �ص� ������ -> count�� �ᵵ ��!!!
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				//ad�� �̸��� ���� �迭 ad[i]
				System.out.println("�ش� ������ ã��");
//				ad[i].showData();
				
			}i++;
		}
		return ad[i] ;
	}
	
	//6. ����
		public void deleteAddr(String name) {
		for(int i=0;i<counter;i++) {
			
			if(ad[i].getName().equals(name)) {
				for(int j=0;i<counter;j++) {
					ad[j]=ad[j+1];
				}
				//�� �Ű����ϱ� ���� �Է¹޾ƾ��� �ε����� -1 ���ָ� �迭 ũ�� ������
				counter--;
				return;
			}
		}
		
		
	}

	//7.����
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
	
	


	



