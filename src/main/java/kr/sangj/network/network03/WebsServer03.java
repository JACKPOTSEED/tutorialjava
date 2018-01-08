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
		
		Thread.currentThread().setName("Main-Thread");		
		
		try {

			serverSocket = new ServerSocket();
						
			new Thread(new AcceptThread(serverSocket)).start();
			
			System.out.println("[" + Thread.currentThread().getName() + " ½ÇÇà]");
			
		} catch (Exception e) {}
			
	}
}
