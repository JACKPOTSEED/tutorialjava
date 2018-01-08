package main.java.kr.sangj.iostream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

public class IoStream09 {

	public void print() {
		
		InputStream is = null;
		PrintWriter pw = null;
		
		try {
			is = new FileInputStream("C:/IoTest/test.txt");
			DataInputStream in = new DataInputStream(is);
			
			int i = in.readInt();			
			
			System.out.println("i "+ i);
			
		} catch (Exception e) {

		}
	}
}
