package chpter01;

public class KoreaTire extends Tire {

		//생성자
		public KoreaTire(String location,int maxRot) {
			// TODO Auto-generated constructor stub
			super(location,maxRot);
		}
		
		//override
		@Override
		public boolean roll() {
			++accRot;
			if(accRot<maxRot) {
				System.out.println(location+"한국타이어 수명:"+(maxRot-accRot));
			return true;}
			else {
				System.out.println("타이어 펑크");
				return false;
			}
			
			
		}
}
