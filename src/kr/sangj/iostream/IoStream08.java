package kr.sangj.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream08 {

	public void insertFile() {
		
		FileInputStream fis 	 = null;
		FileOutputStream fos     = null;
		BufferedInputStream bis  = null;
		BufferedOutputStream bos = null;		
		int data = -1;
		
		try {
			
			fis = new FileInputStream("C:/IoTest/finn.jpg");
			fos = new FileOutputStream("C:/IoTest/copyFinn.jpg");
			
			while ((data = fis.read()) != -1) {
				
				fos.write(data);
			}
			
			System.out.println("복사완료!");
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		}		
	}
}
