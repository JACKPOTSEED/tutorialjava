package main.java.kr.sangj.network.network14;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAccept implements Runnable {

	ServerSocket serverSocket = null;
	ServerManage serverManage = null;
	
	public ServerAccept(ServerSocket serverSocket) {
		
		this.serverSocket = serverSocket;
	}

	@Override
	public void run() {
		
		try {			
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			serverManage = new ServerManage();
			
			while (true) {
				
				/*serverManage.showCurrentUSer();*/
				/*System.out.println("클라이언트 접속 대기중(블로킹)");*/
				Socket socket = serverSocket.accept();
				/*System.out.println("클라이언트가 접속 했습니다.");*/				
											
				new Thread(new ServerReceiver(socket,serverManage)).start();
				
				serverManage.showCurrentUSer();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	
}
