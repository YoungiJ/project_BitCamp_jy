package chpter01;

public class MainStore {
	String blackRamen;
	String redRamen;
	String friedPork;
	String friedMandu;
	String rice;
	

	
	public MainStore(String blackRamen,String redRamen,String friedPork,String friedMandu
			,	String rice) {
		// TODO Auto-generated constructor stub
		this.blackRamen=blackRamen;
		this.redRamen=redRamen;
		this.friedPork=friedPork;
		this.friedMandu=friedMandu;
		this.rice=rice;
		
	}
	
	public MainStore(String blackRamen,String redRamen,String friedPork) {
		// TODO Auto-generated constructor stub
		this();}
		
	
	public MainStore() {
		// TODO Auto-generated constructor stub
		blackRamen="8000";
		redRamen="8000";
		friedPork="12000";
		friedMandu="3000";
		rice="1000";
	}
	
	void print() {
		System.out.println("ÀÚÀå¸é :"+blackRamen);
		System.out.println("Â«»Í :"+redRamen);
		System.out.println("ÅÁ¼öÀ° :"+friedPork);
		System.out.println("±º¸¸µÎ :"+friedMandu);
		System.out.println("°ø±â¹ä :"+rice);
	}
	
}
