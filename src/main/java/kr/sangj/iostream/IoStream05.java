package main.java.kr.sangj.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream05 {
		
	FileOutputStream fs = null;

	public void print() {
	
		try {
			
			byte b[] = "14128583050".getBytes();			
			
			fs = new FileOutputStream("C:/IoTest/IoStream05.txt");
			fs.write(b);
			
		} catch (IOException e) {

			e.printStackTrace();
			
		} finally {
			
			try {
				
				fs.flush();
				fs.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}			
		}
	}
}