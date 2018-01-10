package main.java.kr.sangj.network.network14;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReceiver implements Runnable {
	
	public Socket socket;
	ServerManage serverManage = null;
	boolean flag = true;
	String name = null;
	
	public  ServerReceiver(Socket socket,ServerManage serverManage) {
				
		this.socket = socket;
		this.serverManage = serverManage;
	}
	
	@Override
	public void run() {
				
		DataInputStream dis;
					
		try {
			
			dis = new DataInputStream(socket.getInputStream());
			
			while(true) {		
				
				String str = dis.readUTF();				
				System.out.println("str : " + str);
				
				if (flag) {
					
					name = str;
					
					System.out.println(name + " 님이 입장하셨습니다.");
				
					serverManage.setName(name);
					serverManage.add(socket);		
					
					flag = false;
					
				} else {
					
					String msg = str;
					
					System.out.println(name +" : "+msg + "....");
				}
				
				if (dis.readUTF() == null) {
					
					dis.close();
					serverManage.remove(name);
					System.out.println("클라이언트 나감");
				}
								
						
				/*serverManage.showCurrentUSer();			*/
			}
						
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
	}
}