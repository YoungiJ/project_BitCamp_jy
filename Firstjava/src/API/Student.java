package API;

public class Student {
	private int num;
	private String name;
	
	public Student() {}
	public Student(int num, String name) {
		// TODO Auto-generated constructor stub
		this.num=num;
		this.name=name;
	}
	
	//getter
	public int getNum() {return num;}
	public String getName() {return name;}
	// object�� hashcode�� override\
//Override hashCode �� �ּ�ó���ϸ� hashset�� �����Ҷ� ->��ü ������ �ؽ��ڵ带 ����-> �翬�� �ּҴϱ� �ٸ� ���� ����
//	public int hashCode() {
//		
//		// ��ȣ�� �̸��� �ؽ��ڵ带 ���ļ� ���ο� �ؽ� �ڵ带 ����
//		int hashCode=num;
//		System.out.println(hashCode);
//		return hashCode;
//		
//	}
	@Override// object�� equals�� override
	public boolean equals(Object ob) {
		if(ob instanceof Student) {
			Student student=(Student)ob;
			if(student.getName()==name&& student.getNum()==num) {
				return true;
			}
		}return false;
		
	}

}
