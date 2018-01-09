package main.java.kr.sangj.iostreamnav;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IoStreamNav06 {

	public void editAdd() throws IOException {
		
		BufferedWriter bw = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter("C:/IoTest/test.txt",true));
			 
			bw.write("¼öÁ¤!!");
			
		} catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			
			bw.close();
		}			
	}
}
