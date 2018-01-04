package kr.sangj.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IoStream03 {

	String directory = "C:/IoTest/test.txt";
	String directory2 = "C:/IoTest/aaatest.txt";
	
	public void print() throws IOException {
		
		Reader reader = new FileReader(directory);
		Writer writer = new FileWriter(directory2);
		
		try {
								
			int readChar = 0;
			
			while((readChar = reader.read()) != -1) {
			
				System.out.write(readChar);
				writer.write(readChar);
			}
			
		} catch (Exception e) {

		} finally {
			
			System.out.flush();
			
			writer.flush();
			writer.close();
		}					
	}
}
