package API;

public class HashCodeEx {
	public static void main(String[] args) {
	Student s1=new Student(1,"ȫ�浿");
	Student s2=new Student(1,"�浿");
	
	if(s1.hashCode()==s2.hashCode()) {
		if(s1.equals(s2)) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("key�� ������ value�� �ٸ�");
		}
	}else {
		System.out.println("�ؽ��ڵ尡 �ٸ��Ƿ� �ּҰ� �ٸ��Ƿ� ���ü�� ���ʿ� �ƴ�");
	}
	
	
	
	
	}
}
 