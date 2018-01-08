package main.java.kr.sangj.network.network03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client03 {		
	
	public static void main(String[] args) {
				
		Socket socket = null;
		try {

			socket = new Socket();
			
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("<연결성공>");
			
			String msg = "안녕 서버";
			byte[] bytes = null;
			
			OutputStream os = socket.getOutputStream();
			
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			
			System.out.println("<데이터 보내기 성공>");			
			
			
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
