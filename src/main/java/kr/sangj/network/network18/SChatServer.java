package main.java.kr.sangj.network.network18;

import java.io.DataInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SChatServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
					
		try {

			// serverSocket = new ServerSocket(5001);
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));			
						
			new Thread(new SchatServerAccept(serverSocket)).start();
						
			
		} catch (Exception e) {

		}
	}
}
