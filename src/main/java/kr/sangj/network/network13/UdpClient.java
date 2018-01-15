package main.java.kr.sangj.network.network13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpClient {

	public static void main(String[] args) throws IOException {
		
		try {
			
			DatagramSocket datagramSocket = new DatagramSocket();
			
			for (int i = 0; i < 3; i++) {
				
				String str = "안녕 데이터 내 이름은 " + i;
				byte[] b = str.getBytes();
				
				DatagramPacket packet = new DatagramPacket(b, b.length, new InetSocketAddress("127.0.0.1",5001));
				
				datagramSocket.send(packet);
				
				System.out.println("보낸 바이트 수 : "  + b.length);
			}
			
			
			datagramSocket.close();
			
		} catch (SocketException e) {

			e.printStackTrace();
		}
	}
}
