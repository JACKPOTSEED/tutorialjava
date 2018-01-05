package main.java.kr.sangj.network.network01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer01 {
	
	public static void main(String[] args) {
	
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			while (true) {
				
				System.out.println("�����ٸ�");			
				Socket socket = serverSocket.accept();
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("���������" + isa.getHostName());
				
				byte[] bytes = null;
				String msg = "�ȳ�Ŭ���̾�Ʈ";
				
				InputStream is = socket.getInputStream();
				
				bytes = new byte[100];
				
				int readByteCount = is.read(bytes);
				msg = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("�޽��� �ޱ� ���� : " + msg);
				
				OutputStream os= socket.getOutputStream();
				String message = "��� Ŭ���̾�Ʈ";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("������ ����");
				
				is.close();
				os.close();
				socket.close();
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		if (!serverSocket.isClosed()) {
			
			try {
				
				serverSocket.close();
				
			} catch (IOException e) {
				
			}
		}
	}
	

}
