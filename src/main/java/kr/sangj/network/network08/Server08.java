package main.java.kr.sangj.network.network08;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.SynchronousQueue;

public class Server08 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("��������");
			
			while (true) {
				
				System.out.println("���� ���� �����");
				
				Socket socket = serverSocket.accept();
				
				System.out.println("Ŭ���̾�Ʈ ����");
								
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				
				String str = "������ Ŭ���̾�Ʈ����";
				char[] c = null;
				c = str.toCharArray();
				
				osw.write(c);
				osw.flush();							
								
				InputStream is = socket.getInputStream();
								
				byte[] b = new byte[100];
				
				int i = is.read(b);
				
				String s = new String(b,0,i);
				
				System.out.println("s : " + s);
			}
			
		} catch (Exception e) {

		}
	}
}
