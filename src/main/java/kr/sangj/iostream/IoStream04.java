package main.java.kr.sangj.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IoStream04 {

	public void print() {
		
		File file = new File("C:/IoTest/04.txt");
		
		try {
			
			OutputStream os = new FileOutputStream(file);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}	
	}	
}
