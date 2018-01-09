package main.java.kr.sangj.network.network08;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client08 {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {

			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));														
			System.out.println("클라이언트 접속");
			
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
										
			char[] c = new char[100];
			
			int i = isr.read(c);
			
			String str = new String(c,0,i);
			
			System.out.println("str : " + str);
									
			OutputStream os = socket.getOutputStream();
						
			String s = "클라이언트가 서버에게";
			byte[] b = s.getBytes();
			
			os.write(b);
			os.flush();
			os.close();
			
		} catch (Exception e) {

		}
	}
}
