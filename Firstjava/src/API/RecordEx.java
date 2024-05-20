package API;

public class RecordEx {
	public static void main(String[] args) {
	Member2 member=new Member2("winter","传价捞",25);
	System.out.println(member.id());
	System.out.println(member.name());
	System.out.println(member.age());
	System.out.println(member.toString());
	
	Member2 m1=new Member2("winter","传价捞",25);
	Member2 m2=new Member2("winter","传价捞",25);
	
	}
}
