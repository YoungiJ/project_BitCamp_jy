package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[]args) {

	try{
		Socket socket=new Socket("127.0.0.1",50001);
		
		System.out.println("client연결 성공");

		//데이터 보내기
		String sendMessage="나는 자바가 좋을락 말락 해";
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
		dataOutputStream.writeUTF(sendMessage);
		dataOutputStream.flush();
		System.out.println("클라이언트 데이터 보냄 :"+sendMessage);
		
		//데이터 받기
		DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
		String receive=dataInputStream.readUTF();
		System.out.println(receive+"받음");
		//////////////
		
		//연결 끊기
		socket.close();
		System.out.println("클라이언트 연결 끊음");
		
	}
	catch (Exception e) {
		// TODO: handle exception
	}

}}
