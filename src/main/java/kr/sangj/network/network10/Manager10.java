package main.java.kr.sangj.network.network10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

public class Manager10{

	ArrayList<Socket> arrayList = new ArrayList<Socket>();
	
	void add(Socket socket) {
		
		arrayList.add(socket);
	}
	
	void remove(Socket socket) {
		
		arrayList.remove(socket);
	}

	synchronized void sendToAll(String message) {
		
		PrintWriter printWriter = null;
		Socket socket = null;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			socket = arrayList.get(i);
			
			try {
				
				printWriter = new PrintWriter(socket.getOutputStream());
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
			if (printWriter != null) {
				
				printWriter.println(message);
				printWriter.flush();
			}
		}		
	}
	
	synchronized void sendClientInformation() {
		
		String information = "현재 채팅인원 : " + arrayList.size();
		System.out.println(information);
		sendToAll(information);
	}
	
	void print() {
		
		System.out.println("arrsyList : " + arrayList);
	}		
}
