package NestedClass;

public class Button {
	//static interface
		//abstract method
	
	public static interface CL{
		void onClick();
	}
	//�ʵ�
	private CL cl;
	
	//�׳� �޼���
	public void setClickListener(CL cl) {
		this.cl=cl;
	}
	// �� �����-> interface �ȿ� onclick�� �����ϰ� �������ؼ� - Button.cl.onclick tlqkf
	public void click() {
		this.cl.onClick();//��ư�� Ŭ���ɶ� �����ϴ� �޼��� ����
		
	}
}
