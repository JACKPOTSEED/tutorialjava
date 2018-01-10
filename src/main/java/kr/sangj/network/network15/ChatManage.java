package main.java.kr.sangj.network.network15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;

public class ChatManage {
	
	HashMap<String, OutputStream> clients = new HashMap<String,OutputStream>();
	
	public void addUser(String name, OutputStream outputStream) {
		
		clients.put(name, outputStream);
		
		System.out.println("현재 접속자 수는 " + clients.size() + "입니다.");
	}
	
	public void sendToAll(String msg) {
				
		Iterator it = clients.keySet().iterator();
		
		while (it.hasNext()) {
			
			try {
				
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
				
			} catch (IOException e) {
				
			}
		}
	}
}