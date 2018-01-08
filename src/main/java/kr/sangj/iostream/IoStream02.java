package main.java.kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoStream02 {
	
	public void print() throws IOException {
	
		InputStream  is = new FileInputStream("C:/IoTest/test.txt");
		OutputStream os = new FileOutputStream("C:/IoTest/IoStream02.txt");
		
		try {
		
			int readByte = 0;			
					
			while ((readByte = is.read()) != -1) {
								
				os.write(readByte);
			}							
			
		} catch (IOException e) {

			e.printStackTrace();
			
		} finally {
			
			is.close();
			os.flush();
			os.close();			
		}
	}
}
