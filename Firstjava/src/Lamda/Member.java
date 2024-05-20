package Lamda;

public class Member {
	private String id;
	private String name;
	
	public Member(String id){
		// TODO Auto-generated constructor stub
		this.id=id;
		System.out.println("Member(String id)");
	}
	
	
	public Member(String id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		System.out.println("Member(String id,String name)");
	}
	
	@Override
	public String toString() {
		String info="{id:"+id+",name:"+name+"}";
		return info;
	}

}
