package main.java.kr.sangj.network.network18;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SChatClient {

	public static void main(String[] args) {
		
		Socket socket;
		DataOutputStream dos;
		
		try {

			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1",5001));								
			dos = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("Ŭ���̾�Ʈ : ���Ἲ���ߴ�!!!");
			
			while (true) {
				
				Scanner scanner = new Scanner(System.in);
				String str = scanner.nextLine();
				
				if (str.equals("exit")) {
					
					break;
				}
				
				dos.writeUTF(str);
				dos.flush();				
			}
			
			//TODO exit �� close �ؼ� EOFException connectionreset �������°� �ذ��� ������ 
			dos.writeUTF("exit");
			dos.close();
			socket.close();
								
		} catch (Exception e) {

		}
	}
}
