package DesignPattern;


public class Student {
	//�����л��� ���� ������ ���������� ������ �ִ�.
	// 1���̻��� course�� 
	private String name;
	
	Course[] courses;
	Transcript[] transcript;
	int idx=0;

	//������
	public Student(String name) {
		this.name=name;
		this.courses=new Course[4];
	}
	
	//�ڽ� ���
	public void addTranscript(Transcript transcript) {//�ڽ� ����
		this.transcript[idx++]=transcript;

			
		
	}
	
		
//	
//
	public String getName() {
			return name;
		}
		
}
