package main.java.kr.sangj.network.network15;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClinetSend implements Runnable {
	
	DataOutputStream ds;
	Socket socket;
	String name;
	
	public ChatClinetSend(Socket socket,String name) {
	
		this.socket = socket;
		this.name   = name;
	}
	
	@Override
	public void run() {

		try {
			
			ds = new DataOutputStream(socket.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
			
			if (ds != null) {
				
				ds.writeUTF(name);
			}
			
			while(true) {
								
				String str = scan.nextLine();							
				
				if (str.equals("exit")) {
					
					break;
				}
				
				ds.writeUTF("[" + name + "]" + str);
				ds.flush();							
			}
						
			ds.close();
			
		} catch (Exception e) {
			
		}
	}
}
