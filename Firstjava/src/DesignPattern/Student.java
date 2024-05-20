package DesignPattern;


public class Student {
	//지영학생이 여러 과목의 성적증명서를 가지고 있다.
	// 1개이상의 course를 
	private String name;
	
	Course[] courses;
	Transcript[] transcript;
	int idx=0;

	//생성자
	public Student(String name) {
		this.name=name;
		this.courses=new Course[4];
	}
	
	//코스 등록
	public void addTranscript(Transcript transcript) {//코스 정보
		this.transcript[idx++]=transcript;

			
		
	}
	
		
//	
//
	public String getName() {
			return name;
		}
		
}
