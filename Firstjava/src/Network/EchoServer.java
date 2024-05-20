package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {


    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("시스템을 종료하려면 q를 입력하고 Enter 키를 입력하세요");
        System.out.println("-------------------------");
        
        
        try {
        
        //서버 소켓 만들기
             ServerSocket serverSocket = new ServerSocket(50001);
                
        //소켓 만들기
             Socket socket=serverSocket.accept();
             System.out.println(socket);
        
        //데이터 입출력 스트림 만들기
             DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
             DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        
             
        //데이터 입력하기
            String str="";
             	while(!str.equals("q")) {
             		
             		Scanner sc=new Scanner(System.in);
             		System.out.print("지영:");
             		str=dataInputStream.readUTF();//하고 싶은 말 적기
             		dataOutputStream.writeUTF(str);
             		dataOutputStream.flush();
            
            
             	}

             	dataOutputStream.close();
             	socket.close();
             	serverSocket.close();

        }catch (Exception e) {
			// TODO: handle exception
		}
    
    
    
    
    }}
