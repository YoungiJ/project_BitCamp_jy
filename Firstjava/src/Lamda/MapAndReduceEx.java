package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceEx {
	public static void main(String[]args) {
	
	List<Student> students=Arrays.asList(
			
			new Student("황지영",10),
			new Student("배아파",20),
			new Student("으악",30)
			
			
			);
	
	double avg=students.stream()
	//람다식으로 처리
	.mapToInt(student->student.getScore())
	.average()
	.getAsDouble();//특이하게 마지막에만 ;을 붙이네
	System.out.println(avg);
	
	}
}
