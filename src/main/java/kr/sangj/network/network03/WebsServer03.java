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
				
				System.out.println("[�����ٸ�]");
				Socket socket = serverSocket.accept();	
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("[���������]" + isa.getHostName());
				
				byte[] bytes = null;
				String msg = "�ȳ�Ŭ���̾�Ʈ";
				
				InputStream is = socket.getInputStream();
				
				bytes = new byte[100];
				
				int readByteCount = is.read(bytes);
				msg = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("[�޽��� �ޱ� ����]" + msg);
										
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
