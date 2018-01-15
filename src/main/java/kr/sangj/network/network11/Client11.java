package main.java.kr.sangj.network.network11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client11 {

	public static void main(String[] args) throws IOException {

		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
		
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw.print("C:/IoTest/test.txt");
			pw.flush();
			pw.close();
			
			String rs = br.readLine();
			System.out.println("rs : " + rs);
			
		} catch (Exception e) {
		
		} finally {
			
			socket.close();
		}

	}

}
