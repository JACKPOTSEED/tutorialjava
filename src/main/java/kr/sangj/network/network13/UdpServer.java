package main.java.kr.sangj.network.network13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
	
	public static void main(String[] args) {
		
		try {
			
			DatagramSocket datagramSocket = new DatagramSocket(5001);
			
			while (true) {							
				
				DatagramPacket packet = new DatagramPacket(new byte[100],100);
				
				datagramSocket.receive(packet);
				
				String str = new String(packet.getData(), 0, packet.getLength());
				
				System.out.println("받은내용 : " + str);
			}					
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}	
}
