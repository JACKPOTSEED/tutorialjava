package main.java.kr.sangj.network.network17;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class MChatClient {

	public static void main(String[] args) {
	
		Socket socket = null;
		
		try {

			socket = new Socket(); 
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			new Thread(new MChatClientSender(socket)).start();						
			new Thread(new MChatClientRcv(socket)).start();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}