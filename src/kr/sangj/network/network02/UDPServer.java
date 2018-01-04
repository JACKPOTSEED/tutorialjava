package kr.sangj.network.network02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			byte[] bf = new byte[30];
			
			DatagramPacket dp = new DatagramPacket(bf, bf.length);
			
			while (true) {
				
				try {
					ds.receive(dp);
					String rs1 = new String(dp.getData());
					
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			
		} catch (SocketException e) {

			e.printStackTrace();
		}
		
	}
}
