package main.java.kr.sangj.iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream16 {

	public void dataWrite() throws IOException {
	
		try {
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/IoTest/abc.dat"));
			
			dos.writeInt(123);
			dos.writeBoolean(true);
			dos.writeDouble(50.5);
			dos.writeUTF("»∆πŒ¡§¿Ω");
						
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream("C:/IoTest/abc.dat"));
			
			int s1 = dis.readInt();
			boolean s2 =dis.readBoolean();
			double s3 =dis.readDouble();
			String s4 =dis.readUTF();
		
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
