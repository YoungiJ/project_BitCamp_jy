package API;

import java.io.IOException;

public class InExample {
	public static void main(String[] args) throws IOException {
		
		
	int speed=0;
	int keyCode=0;
	
	while(true) {
		if(keyCode!=13 && keyCode!=10) {
			
			if(keyCode==49) {speed++;}
			else if(keyCode==50) {speed--;}
			else if(keyCode==51) {break;}
			
			System.out.println("현재속도"+speed);
			
			
		}
		keyCode=System.in.read();
		
		
		
		
		
		
	}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}

}
