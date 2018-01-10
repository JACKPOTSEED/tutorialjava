package main.java.kr.sangj.network.network15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatServerReceiveSend implements Runnable {

	Socket socket;
	ChatManage chatManage;
	
	public ChatServerReceiveSend(Socket socket, ChatManage chatManage) {
		
		this.socket = socket;
		this.chatManage = chatManage;
	}

	@Override
	public void run() {

		DataInputStream dis;
		String name = "";
		
		DataOutputStream dos;			
		
		try {
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
								
			name = dis.readUTF();
			
			chatManage.addUser(name, dos);
						
			while (dis != null) {												
				
				chatManage.sendToAll(dis.readUTF());		
			}
			dis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
}
