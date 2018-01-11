package main.java.kr.sangj.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class IoStream06 {

	public void print() throws IOException {
	
		OutputStream os = new FileOutputStream("C:/IoTest/IoStream06.txt");
		
		os.write(65);
		os.flush();
		os.close();
		
		Writer writer = new FileWriter("C:/IoTest/IoStream06_2.txt");
		
		/*InputStream is = new FileInputStream("C:/IoTest/test.txt");
		int i = -1;
		while ((i = is.read()) != -1) {
			
			writer.write(i);
		}*/
		
		Reader reader = new FileReader("C:/IoTest/test.txt");
		int k = -1;
		while ((k = reader.read()) != -1) {
			
			writer.write(k);
		}
		
		
		/*char c1 = 'c';
		
		writer.write(c1);*/
		
		
		/*for (int i = -128; i < 128; i++) {
		
			writer.write(i);
		}*/
		
		writer.flush();
		writer.close();		
	}
	
}
