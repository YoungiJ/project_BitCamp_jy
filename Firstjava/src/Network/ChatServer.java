package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("시스템을 종료하려면 q를 입력하고 Enter 키를 입력하세요");
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);
        String str = "";

        try (ServerSocket serverSocket = new ServerSocket(8880)) {
            System.out.println("서버가 시작됨");

            // 클라이언트 연결 수락
            try (Socket socket = serverSocket.accept()) {
                System.out.println("연결 받아들임");
                while (!str.equals("q")) {

            	Thread thread=new Thread();
            
                // 데이터 입출력 스트림 생성
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
               DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

               
                    // 클라이언트로부터 메시지 수신-> 일단 받아야지
                    String receiveMessage = dataInputStream.readUTF();//client에서 output한거 읽기
                    System.out.println("주현[]:" + receiveMessage);

                   
                    // 메시지 입력
                    System.out.print("지영: ");
                   str = scanner.nextLine();
                    dataOutputStream.writeUTF(str);
                    dataOutputStream.flush();
                    
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
