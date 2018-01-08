package main.java.kr.sangj.network.network03;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class AcceptThread implements Runnable{

	ServerSocket serverSocket;
	Socket socket;
	List<Socket> connections = new ArrayList<Socket>();
	
	AcceptThread(ServerSocket serverSocket) {

		this.serverSocket = serverSocket;		
	}

	@Override
	public void run() {

		Thread.currentThread().setName("Accept-Thread");
		
		try {
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("[��������]");

			while (true) {							
				
				System.out.println("[" + Thread.currentThread().getName() + " �����ٸ�]");
				Socket socket = serverSocket.accept();
				
				connections.add(socket);
				System.out.println("connections Size : " + connections.size() + connections);
				
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("[���������]" + isa.getHostName());
				
				
				
				
				Thread receiveThread = new Thread(new ReceiveThread(socket));
											
				receiveThread.start();
				
				try {
					
					receiveThread.join();
					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		} 
		
		if (!serverSocket.isClosed()) {
			
			try {
				
				serverSocket.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}					
		
		
	}	
}