package API;

public class ToStringEx {
	public static void main(String[] args) {
	
	
	//toString은 문자정보를 알고 싶어서 사용 obj에 사용하면 > @주소가 나옴
		SmartPheon myPheon=new SmartPheon("삼성전자", "@안드로이드");
		String chString=myPheon.toString();
		System.out.println(chString);//toString override한거 적용
		System.out.println(myPheon);//객체를 출력하는 거니까 주소인줄 알았는데 system.out.println안에 객체가 들어갔을때 자동으로 toString으로 바꿔준대!!
	
	}
}
