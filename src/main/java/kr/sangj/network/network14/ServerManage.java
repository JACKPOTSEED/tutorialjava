package main.java.kr.sangj.network.network14;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerManage{
	
	private HashMap<String,Socket> hashMap = new HashMap<String,Socket>();
	private String name;
		
	public synchronized String add(Socket socket) {
		
		hashMap.put(this.name, socket);
		
		System.out.println("hasmMap Add" + hashMap);
		/*notifyAll();*/
		
		return ("hasmMap Add" + hashMap);
		
	}
	
	public synchronized void setName(String name) {
		
		this.name = name;
					
		/*notifyAll();*/				
	}
	
	public synchronized void remove(String name) {
		
		Socket tmpSocket = hashMap.get(name);
		
		try {
			
			tmpSocket.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		hashMap.remove(name);
	}
	
	public synchronized void showCurrentUSer() {
						
		System.out.println("hashmap current : " + hashMap);
		
		/*if (hashMap.isEmpty()) {
					
			try {
				
				wait();
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}*/
		System.out.println("현재 연결 수 :" + hashMap);
	}
	
	public synchronized void sendToAll() {
			
		
	}
}
