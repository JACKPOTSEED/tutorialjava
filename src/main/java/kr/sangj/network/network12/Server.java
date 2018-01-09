package main.java.kr.sangj.network.network12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		BufferedReader br = null;		 
		Socket socket = null;
		FileReader fr = null;
		PrintWriter pw = null;
		String result = "";
		
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			while (true) {
			
				socket = serverSocket.accept();
				System.out.println("서버 연결");
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				String str = br.readLine();				
				String filename = "C:/IoTest/" + str;
				
				System.out.println("filename : " + filename);
				
				br.close();
				
				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				
				String tmp;
				
				while ((tmp = br.readLine()) != null) {
					
					result += tmp + "\n";
				}
				
				System.out.println("result : " + result);
				
				br.close();
				
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
				pw.print(result);				
				
				pw.flush();
				pw.close();
			}
						
		} catch (Exception e) {
		
		} finally {

			try {
				
				socket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}			
		}
	}
}
