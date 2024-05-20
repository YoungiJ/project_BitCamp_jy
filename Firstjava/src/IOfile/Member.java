package IOfile;

import java.io.Serializable;

public class Member implements Serializable {
	private String suc;
	private String name;
	
	//직렬화 제외!가능!
//	private static final long serialVersionUID=1L;
	transient long serialVersionUID=1L;
	
	public Member(String suc,String name) {
		// TODO Auto-generated constructor stub
		this.suc=suc;
		this.name=name;
	}
	@Override
	public String toString() {return suc+":"+name;}
}
