package main.java.kr.sangj.network.network05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		BufferedReader br = null;
		OutputStream os = null;
		InputStream is = null;		
		
		try {

			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5003));
			
			System.out.println("<연결성공>");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			byte[] msg = null;
			
			System.out.println("str : " + str);
			
			os = socket.getOutputStream();
						
			msg = str.getBytes("UTF-8");					
			
			os.write(msg);
			os.flush();
			
			System.out.println("데이터 보내기 성공");
					
			
		} catch (Exception e) {

		}
	}
}
