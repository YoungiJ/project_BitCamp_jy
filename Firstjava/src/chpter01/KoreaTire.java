package chpter01;

public class KoreaTire extends Tire {

		//������
		public KoreaTire(String location,int maxRot) {
			// TODO Auto-generated constructor stub
			super(location,maxRot);
		}
		
		//override
		@Override
		public boolean roll() {
			++accRot;
			if(accRot<maxRot) {
				System.out.println(location+"�ѱ�Ÿ�̾� ����:"+(maxRot-accRot));
			return true;}
			else {
				System.out.println("Ÿ�̾� ��ũ");
				return false;
			}
			
			
		}
}
