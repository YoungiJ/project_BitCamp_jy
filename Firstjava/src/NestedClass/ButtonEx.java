package NestedClass;

public class ButtonEx {
	
	public static void main(String[]args) {

	
		//ok��ư��ü ����
		Button btOk= new Button();
	
		//ok��ư��  ���� ���� Ŭ���� ����( ���� Ŭ����)
		class Okbut implements Button.CL{//public �����Ŷ� �ȳ��� �Ŷ� ���� ����
			@Override
			public void onClick() {
				System.out.println("ok��ư Ŭ��������");
			}

		
			
		}
		//ok��ư�� ������ü ����
		btOk.setClickListener(new Okbut());
		//ok��ư �޼��� ����
		btOk.click();
		
		
		
	
	
		//cancel��ư ��ü ����
		Button btCC=new Button();
		//cancel�� ���� �̺�Ʈ ���� Ŭ���� ( ���� Ŭ����)
		class Cancelbut implements Button.CL{
			@Override
			public void onClick() {
				System.out.println("cancel ��ư ����");
			}			
			
		}
		//cancel��ư�� ������ü ����
		btCC.setClickListener(new Cancelbut());
		//cancel ��ư �޼��� ����
		btCC.click();
	}
}