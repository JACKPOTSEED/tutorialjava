package kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class IoStream10 {

	public static void main(String[] args) {
		
		PrintWriter pw = null;
		
		try {
			
			pw = new PrintWriter(new FileOutputStream("C:/IoTest/FileTest/test.txt"));
			pw.println("adflkaaaaaaaaaabbbbbbbbbb");
											
		} catch (Exception e) {

		} finally {
			
			pw.flush();			
			pw.close();
		}
	}
}
