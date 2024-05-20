package chpter01;

public class Todo {
	//필드 선언
	private String title;
	private String detail;
	private String due;
	private String group;
	private int important;
	
	//생성자
	public Todo() {}
		// TODO Auto-generated constructor stub
		
	public Todo(String title,String due) {
		// TODO Auto-generated constructor stub
		this(title, null, due, null,0);	
	}
	
	public Todo(String title,String detail,String due,String group,int important) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.detail=detail;
		this.due=due;
		this.group=group;	
		this.important=important;	
	}
	
	
	//getter
	public String getTitle(){
		return title;
	}
	public String getDetail(){
		return detail;
	}
	
	public String getDue(){
		return due;
	}
	public String getGroup(){
		return group;
	}
	public int getImportant(){
		return important;
	}
	
	
	//setter
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setDetail(String detail) {
		this.detail=detail;
	}
	
	public void setDue(String due) {
		this.due=due;
	}
	
	public void setGroup(String group) {
		this.group=group;
	}
	
	
	public void setImportant(int important) {
		this.important=important;
	}
	
	
	
}
