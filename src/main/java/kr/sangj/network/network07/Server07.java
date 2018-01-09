package main.java.kr.sangj.network.network07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server07 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(5003);					
			
			System.out.println("���� �ø�");					
			
			while (true) {
			
				System.out.println("���� ��� ��");
				
				socket = serverSocket.accept();
				
				System.out.println("Ŭ���̾�Ʈ ���� ����");		
				
				InputStream is = socket.getInputStream();
				byte b[] = new byte[100];
				
				int i = is.read(b);				
				
				String str = new String(b,0,i);
				
				System.out.println(str);
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
