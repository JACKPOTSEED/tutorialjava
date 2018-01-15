package main.java.kr.sangj.network.network10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Chat implements Runnable {
	
	public Socket socket;
	Manager10 manager10;
	InputStream is = null;
	BufferedReader reader = null;	
	
	public Chat(Socket socket,Manager10 manager10) {
		
		this.socket = socket;
		this.manager10 = manager10;
	}

	@Override
	public void run() {
		
		try {
			
			is = socket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is));
			
			String str = reader.readLine();
			
			System.out.println("str : "  + str);
			
		} catch (Exception e) {
		
		} finally {
			
			try {
				
				manager10.remove(socket);				
				manager10.sendClientInformation();
				System.out.println("클라이언트가 나갔습니다.");
				
				is.close();
				reader.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}			
		}	 
	}
}
