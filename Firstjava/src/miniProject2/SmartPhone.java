package miniProject2;
//smartphone
import java.util.Scanner;

//Ŭ������ ��ü�� �ٲ������
public class SmartPhone {
	
	//�迭��ü ����

	Addr[] ad=new Addr[4];
	Scanner sc=new Scanner(System.in);
	
	String companyName;
	String departName;
	String position;
	String clientName;
	String tradingItem;
	
	int counter=0;// static���� �޾Ƶ� ��������
	//1.�Է¹޾� ��ü ����
	public Addr inputAddrData() {
		
		//�����ϱ�
		
		System.out.print("�̸�: ");
	  	String name=sc.nextLine();
	  	
	    System.out.print("��ȭ��ȣ: ");
	    String phoneNum =sc.nextLine();

	    System.out.print("�̸���: ");
	    String email=sc.nextLine();

	    System.out.print("�ּ�: ");
	    String address=sc.nextLine();

	    System.out.print("�׷�: ");
	    String groupChoice=sc.nextLine();

	    Addr newAddr=new Addr(name,phoneNum,email,address,groupChoice);
    	System.out.println(newAddr);

	    
	    if(groupChoice.equals("company")){
		    System.out.print("ȸ�� �̸�: ");
		    companyName=sc.nextLine();
		    
		    System.out.print("�μ� �̸�: ");
		    departName=sc.nextLine();
		    
		    System.out.print("����: ");
		    position=sc.nextLine();

	    	newAddr=new CompanyAddr(name,phoneNum,email,address,groupChoice,companyName,departName,position);
	    	System.out.println(newAddr);
	    	newAddr.setGroup(groupChoice);

	    }else if(groupChoice.equals("customer")){
		    System.out.print("�� �̸�: ");
	    	clientName=sc.nextLine();
		    
		    System.out.print("��ǰ ǰ��: ");
		    tradingItem=sc.nextLine();
		    
		    System.out.print("����: ");
		    position=sc.nextLine();
		    
	    	newAddr=new CustomerAddr(name,phoneNum,email,address,groupChoice,clientName,tradingItem,position);
	    	newAddr.setGroup(groupChoice);
	    	
	    }
		    return newAddr;}
	
	//2.�迭�� ����ó ��ü ����-> ad[i]�ȿ��ٰ� �� �ֱ�
	void addAddr(Addr newAddr) {
		//�Է¹ޱ�
		ad[counter]=newAddr;
		counter++;
	}

	//3. ����ó ���


//	4.��� ����ó ���
	//��� ����ó ���
		public void printAllAddr() {
			for (int i = 0; i < counter;i++) {
				if(ad[i]!=null) {
				ad[i].printAddr();}
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
				ad[i].printAddr();
				
			}i++;
		}
		return ad[i] ;
	}
	
	//6. ����
	void deleteArr(String name) {

		int i=0;
		int index=0;
		while(true){
				
				if(ad[i]==null) {break;}
				if(ad[i].getName().equals(name)) {
					System.out.println("�ش� ������ ã��2");
					index=i;
				}i++;
			}
		
		//�ڿ� �ִ� �迭���� for������ ������ ����
		for( int j=index;j<ad.length;j++){
			if(ad[j]==null) {break;}
			{ad[j]=ad[j+1];}
			}			
		}

	
	//���⼭ counter�� �Է¹޾ƾ��� �迭�� �ε����� ��Ÿ��
//	public void deleteAddr(String name) {
//		for(int i=0;i<counter;i++) {
//			
//			if(ad[i].getName().equals(name)) {
//				for(int j=0;i<counter;j++) {
//					ad[j]=ad[j+1];
//				}
//				//�� �Ű����ϱ� ���� �Է¹޾ƾ��� �ε����� -1 ���ָ� �迭 ũ�� ������
//				counter--;
//				return;
//			}
//		}
//		
//		
//	}

	//7.����
	void editArr(String name) {
		int i=0;
		while(true){
			
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				System.out.println("�ش� ������ ã��2");
				ad[i]=inputAddrData();

			}i++;
		}

	}
		
}
	

