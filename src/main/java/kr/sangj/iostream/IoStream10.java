package main.java.kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class IoStream10 {

	public void print() {
		
		PrintWriter pw = null;
		
		try {
			
			pw = new PrintWriter(new FileOutputStream("C:/IoTest/FileTest/test133.txt"));
			pw.println("adflkaaaaaaaaaabbbbbbbbbb");
			pw.print(123);
			
		} catch (Exception e) {

		} finally {
			
			pw.flush();			
			pw.close();
		}
	}
}
