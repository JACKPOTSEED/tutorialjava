package main.java.kr.sangj.network.network05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.plaf.synth.SynthScrollBarUI;

import main.java.kr.sangj.network.network03.ReceiveThread;

public class Webserver {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		
		OutputStream os = null;
		BufferedReader br = null;

		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5003));
			
			System.out.println("��������");
			
			while (true) {							
				
				System.out.println("[" + Thread.currentThread().getName() + " �����ٸ�]");
				socket = serverSocket.accept();	
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();				
				System.out.println("[���������]" + isa.getHostName());
				
				byte[] bytes = null;
				String msg = "";
				
				is = socket.getInputStream();
				bytes = new byte[100];
				
				int readByteCount = is.read(bytes);
				msg = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("[�޽��� �ޱ� ����]" + msg);
				
				/*br = new BufferedReader(new InputStreamReader(System.in));
				
				String str = br.readLine();
				byte[] msg2 = null;
				
				System.out.println("str : " + str);
				
				os = socket.getOutputStream();
							
				msg2 = str.getBytes("UTF-8");					
				
				os.write(msg2);
				os.flush();
				
				System.out.println("������ ������ ����");*/
				
			}
		} catch (Exception e) {

		} finally {
			
			try {
				
				serverSocket.close();
				socket.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}			
		}
	}
}
