package chpter01;

public class Student extends People {
	public int studentNo;
	public Student(String name,String ssn,int studentNo) {
		
//		super(name, ssn);
//		this.studentNo=studentNo;
		this.name=name;
		this.ssn=ssn;
		this.studentNo=studentNo;
//		super.name=name;//people���� �����ڸ� ��������
//		super.ssn=ssn;		

	}

}
