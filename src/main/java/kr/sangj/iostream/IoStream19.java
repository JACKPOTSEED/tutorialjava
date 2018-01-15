package main.java.kr.sangj.iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream19 {

	public void dataIOStream() throws IOException {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/IoTest/IoStream19.txt"));
		
		dos.writeUTF("模备具 救崇");
		dos.writeUTF("模备具 肋啊");
		
		dos.flush();
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("C:/IoTest/IoStream19.txt"));
		
		String msg = dis.readUTF();
		
		System.out.println("msg : " + msg);
		
		String msg2 = dis.readUTF();
		
		System.out.println(msg2);
		dis.close();
	}
}
