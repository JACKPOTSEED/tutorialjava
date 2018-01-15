package main.java.kr.sangj.network.network10;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server10 {

	public static void main(String[] args) { 

		ServerSocket serverSocket = null;
		
		try {

			serverSocket = new ServerSocket();			
			new Thread(new AcceptThread10(serverSocket)).start();
			
		} catch (Exception e) {

		}
	}
}
