package main.java.kr.sangj.network.network04;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Webserver {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			serverSocket = new ServerSocket();		

			executorService.execute(new AcceptThread(serverSocket));
			
			executorService.shutdown();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
