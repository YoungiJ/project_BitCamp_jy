package DesignPattern;

public class Main {
	public static void main(String[] args) {
	
	Student s1=new Student("홍길동");
	Student s2=new Student("홍길채");
	
	Course c1=new Course("software engineering");
	Course design=new Course("design pattern");
	Course math=new Course("math");

	
	//길동 소프트웨어 성적 생성
	Transcript t1=new Transcript(s1, c1);
	//학생 정보랑 코스 정보 얻기
	t1.setDate("2024년");
	t1.setGrade("A++");
	t1.print(t1);

	
	Transcript t2=new Transcript(s2, design);
	t2.setDate("2023년");
	t2.setGrade("B0");
	t2.print(t2);

	//함수 -> 코스 정보들이 들어간건>> 학생한테 넣고, 학생정보들이 들어간 건 ->코스 transcript에 넣고
	
//		addTranscript(t1.getCourse())
	

	}
	
	


}
