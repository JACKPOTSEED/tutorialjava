package main.java.kr.sangj.network.network01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client01 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			System.out.println("���� ��û");
			
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("���� ����");
			
			String msg = "�ȳ� ����";
			byte[] bytes = null;
			
			OutputStream os = socket.getOutputStream();
			
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();			
			System.out.println("������ ������ ����");					
		
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			
			int readByteCount = is.read(bytes);
			msg = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("�����͹ޱ⼺��" + msg);
			
		} catch (Exception e) {

		}
		
		if (!socket.isClosed()) {
			
			try {
				
				socket.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}		
		}
	}
}
