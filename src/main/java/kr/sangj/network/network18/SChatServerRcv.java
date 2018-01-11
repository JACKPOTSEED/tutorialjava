package main.java.kr.sangj.network.network18;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class SChatServerRcv implements Runnable {

	DataInputStream dis = null;
	Socket socket = null;
		
	public SChatServerRcv(Socket socket) {
		
		this.socket = socket;
	}

	@Override
	public void run() {

		System.out.println("블락걸림");
		try {
			
			dis = new DataInputStream(socket.getInputStream());
			System.out.println("서버 : " + dis.readUTF());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
									
	}

}
