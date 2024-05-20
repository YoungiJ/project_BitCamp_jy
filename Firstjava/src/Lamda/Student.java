package Lamda;

public class Student {
	private int score;
	private String name;
	

	public Student(String name,int score) {
		
		
		this.score=score;
		this.name=name;
		System.out.println("name:"+ name+" score:"+ score);
		
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
}
