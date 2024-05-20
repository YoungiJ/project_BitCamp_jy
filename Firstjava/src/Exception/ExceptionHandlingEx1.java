package Exception;

public class ExceptionHandlingEx1 {
	
//메서드 안에서 실행
//	static int result;
//	public static void printLength(String data) {
//		try {
//			result=data.length();//at
//			System.out.println("문자수:"+result);
//
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
////			System.out.println(e.getMessage());
////			System.out.println(e.toString());
//			e.printStackTrace();
////			System.out.println("null pointer exception");
//		}	finally {
//			System.out.println("종료");
//
//		}	
//		
//	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		
	String[] arr= {"200","100ㅈㄷ"};
	
	for(int i=0;i<=2;i++) {
		try {
			//string을 정수 객체로 변환하기
			int val=Integer.parseInt(arr[i]);
			System.out.println(i+" "+ val);
			
		}catch (NumberFormatException|NullPointerException|IndexOutOfBoundsException e) {
		
			//2가지 예외를 동일하게 처리
			System.out.println("ㅈㄴ 문제가 있다!"+e.getMessage());
		}
		
	}
	
}

}

