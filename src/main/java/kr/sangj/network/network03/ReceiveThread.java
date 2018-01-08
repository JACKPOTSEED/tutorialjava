package main.java.kr.sangj.network.network03;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ReceiveThread implements Runnable{

	Socket socket;
	
	public ReceiveThread(Socket socket) {
		
		this.socket = socket;
	}
	
	@Override
	public void run() {

		byte[] bytes = null;
		String msg = "";
		
		InputStream is;
			
			try {
				
				is = socket.getInputStream();
				bytes = new byte[100];
				
				int readByteCount = is.read(bytes);
				msg = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("[메시지 받기 성공]" + msg);
				
				
				
			} catch (IOException e) {

				e.printStackTrace();
			}	
	}
}
