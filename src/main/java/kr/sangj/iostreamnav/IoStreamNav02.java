package main.java.kr.sangj.iostreamnav;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IoStreamNav02 {

	public void copyTextFile() {
		
		Reader reader = null;
		Writer writer = null;
		
		int data = -1;
		char[] cbuf = new char[100];
		
		try {
			
			reader = new FileReader("C:/IoTest/test.txt");
			writer = new FileWriter("C:/IoTest/copytext123.txt");			
			
			while ((data = reader.read(cbuf)) != -1) {
				
				writer.write(data);
			}
			
			System.out.println("텍스트복사완료");
			
		} catch (Exception e) {

		} finally {
			
			try {
				
				reader.close();
				writer.flush();
				writer.close();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
}
