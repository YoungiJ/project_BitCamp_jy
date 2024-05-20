package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 8880)) {
            System.out.println("client 연결 성공");

            // 데이터 입출력 스트림 생성
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            String str = "";

            while (!str.equals("q")) {
                // 메시지 입력
                System.out.print("주현: ");
                str = scanner.nextLine();
                dataOutputStream.writeUTF(str);//씀
                dataOutputStream.flush();//다씀

                
                // 서버로부터 메시지 수신
                String receiveMessage = dataInputStream.readUTF();
                System.out.println("지영[]: " + receiveMessage);
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
