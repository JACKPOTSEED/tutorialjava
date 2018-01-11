package main.java.kr.sangj.network.network17;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class MChatClientRcv implements Runnable {

	DataInputStream dis; 
	Socket socket;
		
	public MChatClientRcv(Socket socket) {
	
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			
			dis = new DataInputStream(socket.getInputStream());
		
			while (dis != null) {
				
				String clinetMsg = dis.readUTF();
				System.out.println(clinetMsg);
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}		
	}
}
