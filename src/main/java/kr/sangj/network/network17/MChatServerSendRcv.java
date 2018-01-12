package main.java.kr.sangj.network.network17;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MChatServerSendRcv implements Runnable{
	
	Socket socket = null;
	DataInputStream dis = null;	
	DataOutputStream dos = null;	
	MChatManagement mChatManagement = null;
	
	public MChatServerSendRcv(Socket socket, MChatManagement mChatManagement) {
		
		this.socket = socket;
		this.mChatManagement = mChatManagement;
	}
	
	@Override
	public void run() {
				
		try {
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("서버와 연결이 완료되었습니다.");	
			
			mChatManagement.add(dos);
			
			while (true) {
						
				String msg = dis.readUTF();
				
				if (msg != null || "".equals(msg)) {
					
					break;
				}
				
				mChatManagement.sendToAll(msg);				
			}
						
		} catch (IOException e) {
			
			e.printStackTrace();
				
		} finally {
			
			try {
				dos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			try {
				dis.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			// 여기서 remove MChatMagenagemetn
		}
	}
}
