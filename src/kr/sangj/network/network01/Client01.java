package kr.sangj.network.network01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client01 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			System.out.println("���� ��û");
			
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("���� ����");
			
		} catch (Exception e) {

		}
		
		if (!socket.isClosed()) {
			
			try {
				
				socket.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}		
		}
	}
}
