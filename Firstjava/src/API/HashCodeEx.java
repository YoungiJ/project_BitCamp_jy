package API;

public class HashCodeEx {
	public static void main(String[] args) {
	Student s1=new Student(1,"홍길동");
	Student s2=new Student(1,"길동");
	
	if(s1.hashCode()==s2.hashCode()) {
		if(s1.equals(s2)) {
			System.out.println("동등 객체");
		}else {
			System.out.println("key는 같은데 value는 다름");
		}
	}else {
		System.out.println("해시코드가 다르므로 주소가 다르므로 동등객체가 애초에 아님");
	}
	
	
	
	
	}
}
 