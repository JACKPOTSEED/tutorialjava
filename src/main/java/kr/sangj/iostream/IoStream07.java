package main.java.kr.sangj.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IoStream07 {

	String str = "C:\\IoTest\\zzz.txt";
			
	public void print() throws IOException {
		
		Reader reader = null;
		
		try {
			reader = new FileReader(str);
			
			int i = 0;
			
			while (( i = reader.read()) != -1) {
				
				System.out.write(i);
			}
			 
		}catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			System.out.flush();
			reader.close();
		}			
	}
}