package API;

public class Member {
	public String str;
	Member(String str){
		this.str=str;
	}
	//�ּ� ���ߴµ� ������ ���� ��

	@Override
	public boolean equals(Object ob1) {
		
		if(ob1 instanceof Member) {
			Member other=(Member) ob1;//casting
			return str.equals(other.str);

		}			return false;

		
	}

}
