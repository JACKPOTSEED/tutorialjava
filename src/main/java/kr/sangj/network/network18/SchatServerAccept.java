package main.java.kr.sangj.network.network18;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SchatServerAccept implements Runnable {

	ServerSocket serverSocket; 
	Socket socket = null;
	
	
	public SchatServerAccept(ServerSocket serverSocket) {
		
		this.serverSocket = serverSocket;
	}

	@Override
	public void run() {

		while (true) {					
			
			try {
				
				System.out.println("서버대기중");
				socket = serverSocket.accept();
				
				System.out.println("서버에 클라이언트 들어옴");
				
				new Thread(new SChatServerRcv(socket)).start();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
			
			
		}	
	}

}
