package API;

public class ToStringEx {
	public static void main(String[] args) {
	
	
	//toString�� ���������� �˰� �; ��� obj�� ����ϸ� > @�ּҰ� ����
		SmartPheon myPheon=new SmartPheon("�Ｚ����", "@�ȵ���̵�");
		String chString=myPheon.toString();
		System.out.println(chString);//toString override�Ѱ� ����
		System.out.println(myPheon);//��ü�� ����ϴ� �Ŵϱ� �ּ����� �˾Ҵµ� system.out.println�ȿ� ��ü�� ������ �ڵ����� toString���� �ٲ��ش�!!
	
	}
}
