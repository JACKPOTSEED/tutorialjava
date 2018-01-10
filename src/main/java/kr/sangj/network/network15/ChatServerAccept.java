package main.java.kr.sangj.network.network15;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerAccept implements Runnable{

	ServerSocket serverSocket;
	ChatManage chatManage;
	public ChatServerAccept(ServerSocket serverSocket,ChatManage chatManage) {
		
		this.serverSocket = serverSocket;
		this.chatManage = chatManage;
	}

	@Override
	public void run() {

		try {
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			while(true) {
				
				System.out.println("서버대기중");
				
				Socket socket = serverSocket.accept();
				
				System.out.println("클라이언트 들어옴");
				
				new Thread(new ChatServerReceiveSend(socket,chatManage)).start();						
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}			
	}
}
