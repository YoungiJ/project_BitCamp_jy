package API;

import java.util.HashSet;

public class HashsetEx {

//	HashSet<E>
	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		
		Student s1= new Student(1,"홍길동");
		hashSet.add(s1);// object를 넣어야함
		System.out.println("저장된 객체의 수 "+ hashSet.size());
		
		
		Student s2= new Student(1,"홍길동");
		hashSet.add(s2);// object를 넣어야함
		System.out.println("저장된 객체의 수 "+ hashSet.size());


		Student s3= new Student(2,"홍길동");
		hashSet.add(s3);// object를 넣어야함
		System.out.println("저장된 객체의 수 "+ hashSet.size());

	}	
}
