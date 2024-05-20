package Collection;

import java.util.TreeSet;

public class TreesetBook {
	public static void main(String[] args) {
	
		TreeSet<Student> treeset=new TreeSet<>();
		treeset.add(new Student("지영", 20));
		treeset.add(new Student("지은", 30));
		
		Student student=treeset.first();
		System.out.println(student.score);
		System.out.println(student.id);

	
	}
}
