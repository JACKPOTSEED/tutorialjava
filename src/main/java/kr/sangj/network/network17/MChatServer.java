package main.java.kr.sangj.network.network17;

import java.io.DataInput;
import java.io.DataInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MChatServer {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
					
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			new Thread(new MChatServerAccept(serverSocket)).start();					
						
		} catch (Exception e) {

		}
	}
}
