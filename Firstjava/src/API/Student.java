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
	// object의 hashcode를 override\
//Override hashCode 를 주석처리하면 hashset을 실행할때 ->객체 번지로 해시코드를 실행-> 당연히 주소니까 다른 값이 나옴
//	public int hashCode() {
//		
//		// 번호와 이름의 해시코드를 합쳐서 새로운 해시 코드를 생성
//		int hashCode=num;
//		System.out.println(hashCode);
//		return hashCode;
//		
//	}
	@Override// object의 equals를 override
	public boolean equals(Object ob) {
		if(ob instanceof Student) {
			Student student=(Student)ob;
			if(student.getName()==name&& student.getNum()==num) {
				return true;
			}
		}return false;
		
	}

}
