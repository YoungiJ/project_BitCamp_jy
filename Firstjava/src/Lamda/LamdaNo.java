package Lamda;


public class LamdaNo {
	public static void main(String[]args) {
		
		
		Person person=new Person();
		
		person.action(()->{
			
			System.out.println("출근을 합니다.");
			System.out.println("수업을 듣습니다.");
			
		});
		
		person.action(()->System.out.println("퇴근합니다."));
	}

}
