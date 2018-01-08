package main.java.kr.sangj.network.network04;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptThread implements Runnable {

	ServerSocket serverSocket = null;
	Socket socket = null;
	
	public AcceptThread(ServerSocket serverSocket) {
		
		this.serverSocket = serverSocket;
	}
	
	@Override
	public void run() {
		
		try {
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5003));
			
			while (true) {
								
				System.out.println("������������");
				socket = serverSocket.accept();
				
				System.out.println("���ο�Ŭ���̾�Ʈ");
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("[���������]" + isa.getHostName());
				
				Thread receiveThread = new Thread(new ReceiveThread(socket));
				
				receiveThread.start();				
				
			}	
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		if (!serverSocket.isClosed()) {
			
			try {
				
				serverSocket.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
}