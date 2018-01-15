package main.java.kr.sangj.network.network15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient3 {

	public static void main(String[] args) {

		Socket socket = null;		
		DataInputStream dis = null;		
		String name = "¹æ°üÀÚ";
		
		try {
			
			socket = new Socket();			
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));			
			
			new Thread(new ChatClinetSend(socket,name)).start();
			
			dis = new DataInputStream(socket.getInputStream());
			
			while(dis != null) {
				
				System.out.println(dis.readUTF());
			}			
			
			socket.close();
			
		} catch (Exception e) {

		}
	}
}