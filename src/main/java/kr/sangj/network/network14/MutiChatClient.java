package main.java.kr.sangj.network.network14;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class MutiChatClient {

	public static void main(String[] args) throws IOException {
		
		Socket socket = null;
		DataOutputStream dos = null;
		boolean flag = true;
		String str = null;
		
		try {

			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			
			dos = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("서버에 접속했습니다.");
			System.out.println("이름을 입력해 주세요.");
			
			
			while(true) {
					
				Scanner scan = new Scanner(System.in);
				
				if (flag) {
									
					str = scan.nextLine();
					
					flag = false;			
					
				} else {
					
					
					str = scan.nextLine();
				}
				
							
				if (str == null || str.equals("exit")) {
					
					System.out.println("exit입력됨");
					break;
				}
											
				dos.writeUTF(str);				
				dos.flush();				
				
				System.out.println("이름 : " + str + "입력완료");					
			}
			
			dos.close();
			
		} catch (Exception e) {

		}
		
		if (!socket.isClosed()) {
			
			socket.close();
		}
	}
}
