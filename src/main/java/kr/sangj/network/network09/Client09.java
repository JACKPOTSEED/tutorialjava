package main.java.kr.sangj.network.network09;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client09 {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		PrintWriter pw = null;
		try {
		
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5002));
			System.out.println("서버 연결완료");
			
			pw = new PrintWriter(socket.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			System.out.println("str : " + str);				
			pw.println(str);
			pw.flush();
			
		} catch (Exception e) {

		}
	}

}
