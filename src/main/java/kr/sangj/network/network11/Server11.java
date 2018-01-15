package main.java.kr.sangj.network.network11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server11 {
	
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private BufferedReader reader = null;
	private PrintWriter writer = null;
	
	public void start() throws IOException {		
		
		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			while (true) {
			
				socket = serverSocket.accept();
				System.out.println("클라 진입");
				
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
				
				sendFile();
							
			}
									
		} catch (Exception e) {

		} finally {
			
			socket.close();
			serverSocket.close();
		}
	}
	
	public void sendFile() {
		
		String fileName;
		
		try {
			
			fileName = reader.readLine();																	
			writer.println(findFile(fileName));
			
			System.out.println("fileName : " + fileName);
			System.out.println("findFile(fileName) : " + findFile(fileName));
			
			writer.flush();			
			
			reader.close();	
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}			
	}
	
	public String findFile(String fileName) throws IOException {			
		
		String result = null;
		
		FileReader fileReader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileReader);			
		
			String tmp;
			
			while((tmp = br.readLine())!=null) {
				
				result += tmp + "\n";
			}		
			
			br.close();			
			
		return result;				
	}
}