package kr.sangj.network.network01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer01 {
	
	public static void main(String[] args) {
	
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			while (true) {
				
				System.out.println("연결기다림");			
				Socket socket = serverSocket.accept();
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("연결수락함" + isa.getHostName());
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		if (!serverSocket.isClosed()) {
			
			try {
				
				serverSocket.close();
				
			} catch (IOException e) {
				
			}
		}
	}
	

}
