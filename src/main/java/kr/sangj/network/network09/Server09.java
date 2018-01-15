package main.java.kr.sangj.network.network09;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server09 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		String str = "1";
		
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5002));			
			System.out.println("서버시작");
			
			while (true) {
			
				System.out.println("서버 응답 대기중");
				
				Socket socket = serverSocket.accept();
				
				System.out.println("클라언트 들어옴");
				
				InputStream is = socket.getInputStream();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				
				System.out.println("str : " + str);
				
				str = reader.readLine();
				
				
				System.out.println("str : " + str);
								
			}
			
		} catch (Exception e) {

		}
	}
}
