package DesignPattern;

public class Course {
	//운영체제 과목에서 여러 성적 증명서 존재
	
	private String coursename;
	Student[] students;
	Transcript[] transcript;//학생들 정보가 저장되어야함
	int idx=0;


	public Course(String coursename) {
		this.coursename=coursename;
		this.students=new Student[4];
	}
	
	public void addTranscript(Transcript transcript) {
		//성적증명서에 course들을 등록하는 일
		this.transcript[idx++]=transcript;
		System.out.println("학생을 등록하였습니다.");
	}
	
	

	public String getName() {
		return coursename;
	}
}
