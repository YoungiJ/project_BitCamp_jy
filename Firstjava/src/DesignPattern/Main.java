package DesignPattern;

public class Main {
	public static void main(String[] args) {
	
	Student s1=new Student("ȫ�浿");
	Student s2=new Student("ȫ��ä");
	
	Course c1=new Course("software engineering");
	Course design=new Course("design pattern");
	Course math=new Course("math");

	
	//�浿 ����Ʈ���� ���� ����
	Transcript t1=new Transcript(s1, c1);
	//�л� ������ �ڽ� ���� ���
	t1.setDate("2024��");
	t1.setGrade("A++");
	t1.print(t1);

	
	Transcript t2=new Transcript(s2, design);
	t2.setDate("2023��");
	t2.setGrade("B0");
	t2.print(t2);

	//�Լ� -> �ڽ� �������� ����>> �л����� �ְ�, �л��������� �� �� ->�ڽ� transcript�� �ְ�
	
//		addTranscript(t1.getCourse())
	

	}
	
	


}
