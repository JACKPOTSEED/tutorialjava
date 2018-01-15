package main.java.kr.sangj.network.network10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client10 {

	public static void main(String[] args) {
		
		Socket socket = null;
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("서버 연결 성공");					
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str =br.readLine();
			
			System.out.println("클라이언트가 전송한 문자열 : " + str);
			
			os = socket.getOutputStream();
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os)));
			
			pw.println(str);
			pw.flush();
			
			InputStream is = socket.getInputStream();
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is));
			
			String tmp = br2.readLine();			
			System.out.println("tmp : " + tmp);
			
		} catch (Exception e) {

		} finally {
			
			try {
				
				os.close();
				pw.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}			
		}
	}
}
