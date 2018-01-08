package main.java.kr.sangj.iostream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoStream01 {

	String directory = "C:/IoTest/test.txt";
	
	public void print() throws IOException {
		
		/* FileInputStream �� �Ű������� file��θ� �������ְų� Stirng ��θ� �������൵ �����ϴ�.
		 * 
		 * File file = new File("C:/IoTest/test.txt");
		InputStream  is = new FileInputStream(file);*/
		
		InputStream  is = new FileInputStream(directory);
				
		try {
					
			int readByte;
					
			while ((readByte= is.read()) != -1) {
							
				System.out.write(readByte);
			}

		} catch (IOException e) {

			e.printStackTrace();
			
		} finally {
			
			System.out.flush();
			is.close();
		}		
	}
}