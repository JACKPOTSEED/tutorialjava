package main.java.kr.sangj.network.network18;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SChatClient {

	public static void main(String[] args) {
		
		Socket socket;
		DataOutputStream dos;
		
		try {

			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1",5001));								
			dos = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("클라이언트 : 연결성공했다!!!");
			
			while (true) {
				
				Scanner scanner = new Scanner(System.in);
				String str = scanner.nextLine();
				
				if (str.equals("exit")) {
					
					break;
				}
				
				dos.writeUTF(str);
				dos.flush();				
			}
			
			//TODO exit 시 close 해서 EOFException connectionreset 에러나는거 해결해 봐야함 
			dos.writeUTF("exit");
			dos.close();
			socket.close();
								
		} catch (Exception e) {

		}
	}
}
