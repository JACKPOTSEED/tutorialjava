package main.java.kr.sangj.network.network14;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MultiChatServer {

	public HashMap<String, DataOutputStream> clients;
	
	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = null;
		
		try {

			serverSocket = new ServerSocket();			
			
			new Thread(new ServerAccept(serverSocket)).start();			
			
		} catch (Exception e) {

		}			
	}
	
	/*public void stopServer() {
		
		if (!serverSocket.isClosed()) {
			
			serverSocket.close();
		}
	}*/
}
