package DesignPattern;

public class Course {
	//�ü�� ���񿡼� ���� ���� ���� ����
	
	private String coursename;
	Student[] students;
	Transcript[] transcript;//�л��� ������ ����Ǿ����
	int idx=0;


	public Course(String coursename) {
		this.coursename=coursename;
		this.students=new Student[4];
	}
	
	public void addTranscript(Transcript transcript) {
		//���������� course���� ����ϴ� ��
		this.transcript[idx++]=transcript;
		System.out.println("�л��� ����Ͽ����ϴ�.");
	}
	
	

	public String getName() {
		return coursename;
	}
}
