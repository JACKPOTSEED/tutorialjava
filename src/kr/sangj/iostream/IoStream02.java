package kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoStream02 {

	String directory = "C:/IoTest/test.txt";	
	String directory2 = "C:/IoTest/wtest.txt";	
	
	public void print() throws IOException {
	
		InputStream  is = new FileInputStream(directory);
		OutputStream os = new FileOutputStream(directory2);
		
		try {
		
			int readByte = 0;
			byte[] readBytes = new byte[1];
					
			while ((readByte = is.read()) != -1) {
				
				System.out.write(readByte);
				os.write(readByte);
			}		
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			
			System.out.flush();
			os.flush();
			is.close();
		}
	}
}
