package main.java.kr.sangj.network.network12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader reader = null;
		String result = "";
		
		try {

			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1",5001));
		
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			pw.print("test.txt");
			
			pw.flush();
			pw.close();
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			result = reader.readLine();
			
			System.out.println("result : " + result);
			
		} catch (Exception e) {

		} finally {
			
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
