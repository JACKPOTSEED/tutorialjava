package main.java.kr.sangj.iostreamnav;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamNav05 {

	public void printDataStream() {
		
		DataOutputStream dos = null;
		
		try {
			
			dos= new DataOutputStream(new FileOutputStream("C:/IoTest/test.txt"));
			
			dos.writeInt(30);
			dos.writeBoolean(true);
			dos.writeDouble(50.5);
			
			System.out.println("출력완료");
						
		} catch (Exception e) {

		} finally {
			
			try {
				
				dos.flush();
				dos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}		
		}						
	}
}
