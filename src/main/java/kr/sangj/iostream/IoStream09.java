package main.java.kr.sangj.iostream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

public class IoStream09 {

	public static void main(String[] args) {
		
		InputStream is = null;
		PrintWriter pw = null;
		
		try {
			is = new FileInputStream("C:/IoTest/test.txt");
			DataInputStream in = new DataInputStream(is);
			
			int i = in.readInt();
			double d = in.readDouble();			
			
			System.out.println("i "+ i);
			
		} catch (Exception e) {

		}
	}
}
