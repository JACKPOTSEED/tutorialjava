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
		char[] cbuf = new char[2];
		
		try {
			
			reader = new FileReader("C:/IoTest/test.txt");
			writer = new FileWriter("C:/IoTest/IoStreamNav02.txt");			
			
			while ((data = reader.read(cbuf)) != -1) {
				
				String str = new String(cbuf,0,2);
				
				System.out.println(str);
				
				writer.write(str);
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
