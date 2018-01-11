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
				
				System.out.println("���������");
				socket = serverSocket.accept();
				
				System.out.println("������ Ŭ���̾�Ʈ ����");
				
				new Thread(new SChatServerRcv(socket)).start();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
			
			
		}	
	}

}
