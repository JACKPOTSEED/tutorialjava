package main.java.kr.sangj.network.network06;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSend {

	public static void main(String[] args) {
		
		try {
			
			DatagramSocket datagramSocket = new DatagramSocket();
			
			System.out.println("�߽� ����");
			
			for (int i = 0; i < 3; i++) {
				
				String data = "�޽���" +  i;
				byte[] byteArr = data.getBytes("UTF-8");
				DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("127.0.0.1",5001));
				
				datagramSocket.send(packet);
				
				System.out.println("[���� ����Ʈ ��]:" + byteArr.length + "bytes");
			}
			
			System.out.println("�߽�����");
			
			datagramSocket.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
