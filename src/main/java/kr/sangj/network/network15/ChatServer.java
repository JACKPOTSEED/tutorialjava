package main.java.kr.sangj.network.network15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ChatServer {

	public static void main(String[] args) {
			
		ServerSocket serverSocket = null;	
		ChatManage chatManage = new ChatManage();
		
		try {

			serverSocket = new ServerSocket();
			
			new Thread(new ChatServerAccept(serverSocket,chatManage)).start(); 
						
		} catch (Exception e) {

		}
	}	
}
