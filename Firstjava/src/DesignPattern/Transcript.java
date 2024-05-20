package DesignPattern;

public class Transcript {
	
	
	private String date;
	private String grade; 
	Student students;
	Course courses;


	public Transcript(Student student,Course courses) {
		this.students=student;
		this.courses=courses;

	
		
	}
	//
	public Student getStudent() {
		return students;
		
	
	}
	
	//
	public Course getCourse() {
		return courses;
		
	
	}
	//
	public void setDate(String date) {
		
		this.date=date;
	}
	
	//
	public String getDate(){
		return date;
	}
	

	//
	public void setGrade(String grade) {
		this.grade=grade;
		
	}
	
	//
	public String getGrade() {
		return grade;
	}
	
	//print
	public void print(Transcript t) {
		System.out.println(t.getStudent().getName()+"�� "+
					t.getDate()+" ��  ������ "+t.getCourse().getName()+" ���� "+t.getGrade()+" �� �޾Ҵ�.");
		
	}


}
