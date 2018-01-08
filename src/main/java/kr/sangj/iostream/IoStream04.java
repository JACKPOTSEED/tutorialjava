package main.java.kr.sangj.iostream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IoStream04 {

	public void print() {
		
		File file = new File("C:/IoTest/Iostream04.txt");
		OutputStream os = null;
		
		try {
			
			os = new FileOutputStream(file);							
			
			PrintStream ps = new PrintStream(new BufferedOutputStream(os));
			
			ps.println("프린트스트림림");
			
			ps.flush();			
			ps.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} 	
	}	
}
