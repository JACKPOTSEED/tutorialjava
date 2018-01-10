package main.java.kr.sangj.network.network10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptThread10 implements Runnable{

	public ServerSocket serverSocket;	
	Manager10 manager10 = new Manager10(); 
		
	public AcceptThread10(ServerSocket serverSocket) {

		this.serverSocket = serverSocket;	
	}

	@Override
	public void run() {

		try {
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			//System.out.println("서버에 들어감");			
			
			while (true) {
				
				System.out.println("클라이언트 응답 대기중");
				Socket socket = serverSocket.accept();
				System.out.println("서버에 클라이언트 들어옴");
				
				manager10.add(socket);
				/*manager10.print();*/
				manager10.sendClientInformation();
				
				new Thread(new Chat(socket,manager10)).start();
				
								
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}		
	}
}
