package main.java.kr.sangj.network.network02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.channels.DatagramChannel;

public class UDPClient {
	
	public static void main(String[] args) {
		
		try {
			
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia    = InetAddress.getByName("127.0.0.1");
			byte[] bf =  "¾È³ç".getBytes();					
			DatagramPacket dp = new DatagramPacket(bf, bf.length,ia,9999);
			
			try {
				ds.send(dp);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
					
		} catch (SocketException | UnknownHostException e) {
			
			e.printStackTrace();
		}
		
				
	}
}
