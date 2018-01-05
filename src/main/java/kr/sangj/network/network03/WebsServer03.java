package main.java.kr.sangj.network.network03;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import main.java.kr.sangj.main.Main;

public class WebsServer03 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket  = null;
		
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));					
			
			while (true) {
				
				System.out.println("[연결기다림]");
				Socket socket = serverSocket.accept();	
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("[연결수락함]" + isa.getHostName());
				
				byte[] bytes = null;
				String msg = "안녕클라이언트";
				
				InputStream is = socket.getInputStream();
				
				bytes = new byte[100];
				
				int readByteCount = is.read(bytes);
				msg = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("[메시지 받기 성공]" + msg);
										
			}
		} catch (Exception e) {}
		
		if (!serverSocket.isClosed()) {
			
			try {
				
				serverSocket.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
}
