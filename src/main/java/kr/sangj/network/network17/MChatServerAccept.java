package main.java.kr.sangj.network.network17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MChatServerAccept implements Runnable {

	ServerSocket serverSocket;
	Socket socket = null;
	MChatManagement mChatManagement = new MChatManagement();
	
	public MChatServerAccept(ServerSocket serverSocket) {
		
		this.serverSocket = serverSocket;
	}

	@Override
	public void run() {
				
		while (true) {
			
			try {
				
				System.out.println("서버대기중");
				
				socket = serverSocket.accept();							
				
				new Thread(new MChatServerSendRcv(socket,mChatManagement)).start();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}		
		}
		
		//TODO 서버소켓 닫기 추가
	}
}