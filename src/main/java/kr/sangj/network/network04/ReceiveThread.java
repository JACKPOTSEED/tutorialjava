package main.java.kr.sangj.network.network04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ReceiveThread implements Runnable {

	Socket socket = null;
		
	public ReceiveThread(Socket socket) {

		this.socket = socket;
	}

	@Override
	public void run() {
				
		String msg = null;
		InputStream is = null;
		int data = -1;
		
		try {
						
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			msg = br.readLine();
			
			System.out.println("msg : " + msg);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
