package main.java.kr.sangj.network.network03;

import java.net.ServerSocket;
import java.net.Socket;

public class AcceptThread implements Runnable{

	ServerSocket serverSocket;
	Socket socket;
	
	private AcceptThread(ServerSocket serverSocket) {

		this.serverSocket = serverSocket;
	}

	@Override
	public void run() {

		
	}	
}