package main.java.kr.sangj.network.network17;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MChatClientSender implements Runnable{

	DataOutputStream dos = null;
	Socket socket;
	
	public MChatClientSender(Socket socket) {
	
		this.socket = socket;
	}
	
	@Override
	public void run() {

		try {
			
			dos = new DataOutputStream(socket.getOutputStream());
			
			while (true) {
				
				Scanner scan = new Scanner(System.in);
				String clientMsg = scan.nextLine();
				
				if (clientMsg.equals("exit")) {
					
					break;
				}
				
				dos.writeUTF(clientMsg);
				dos.flush();
			}
			
			dos.close();
							
		} catch (IOException e) {

			e.printStackTrace();
		}					
	}
}
