package main.java.kr.sangj.network.network04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientThread {

	public static void main(String[] args) {
		
		Socket socket = null;	
		BufferedReader br = null;
		OutputStream os = null;
		
		try {
			
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5003));
			
			System.out.println("���Ἲ��");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			byte[] msg = null;
			
			System.out.println("str : " + str);
			
			os = socket.getOutputStream();
						
			msg = str.getBytes("UTF-8");					
			
			os.write(msg);
			os.flush();
			
			System.out.println("������ ������ ����");
			
		} catch (IOException e) {

			e.printStackTrace();
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
