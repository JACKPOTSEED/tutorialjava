package main.java.kr.sangj.network.network07;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client07 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
		
			socket = new Socket("127.0.0.1", 5003);			
			
			System.out.println("연결성공");
			
			OutputStream os = socket.getOutputStream();
			
			String str = "안녕서버";
			byte[] b = str.getBytes();
			
			os.write(b);
			os.flush();
			
			os.close();
			
		} catch (Exception e) {

		} finally {
			
			try {
				
				socket.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}