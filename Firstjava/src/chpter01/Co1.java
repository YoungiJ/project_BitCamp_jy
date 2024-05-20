package chpter01;

public class Co1 {

	public static void main(String[] args) {
		int[]scores= {95,71,84,93,87};
		
		int sum=0;
		for(int score:scores) {
			sum=sum+score;
		}
		System.out.println("점수종합="+sum);
		
		double avg=(double)sum/scores.length;
		System.out.println("평균점수="+avg);

	}

}
