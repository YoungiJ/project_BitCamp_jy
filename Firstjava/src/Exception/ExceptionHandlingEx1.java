package Exception;

public class ExceptionHandlingEx1 {
	
//�޼��� �ȿ��� ����
//	static int result;
//	public static void printLength(String data) {
//		try {
//			result=data.length();//at
//			System.out.println("���ڼ�:"+result);
//
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
////			System.out.println(e.getMessage());
////			System.out.println(e.toString());
//			e.printStackTrace();
////			System.out.println("null pointer exception");
//		}	finally {
//			System.out.println("����");
//
//		}	
//		
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		
	String[] arr= {"200","100����"};
	
	for(int i=0;i<=2;i++) {
		try {
			//string�� ���� ��ü�� ��ȯ�ϱ�
			int val=Integer.parseInt(arr[i]);
			System.out.println(i+" "+ val);
			
		}catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
		
			//2���� ���ܸ� �����ϰ� ó��
			System.out.println("���� ������ �ִ�!"+e.getMessage());
		}
		
	}
	
}

}

