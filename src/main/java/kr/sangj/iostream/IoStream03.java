package main.java.kr.sangj.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IoStream03 {
	
	public void print() {
		
		Reader reader = null;		
		Writer writer = null;
		int data = -1;		
		
		try {
			
			reader = new FileReader("C:/IoTest/test.txt");
			writer = new FileWriter("C:/IoTest/Iostream03.txt");
			
			while ((data = reader.read()) != -1) {
									
				writer.write(data);
			}			
			
		} catch (Exception e) {
			
		} finally {
			
			try {
				
				reader.close();
				writer.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}			
		}
	}
}
