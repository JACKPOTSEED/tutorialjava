package main.java.kr.sangj.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class IoStrea14 {

	public void print() {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("C:/IoTest/zzz.txt",true);
			fw.write("Ãß°¡");
			
			
		} catch (Exception e) {
			
		} finally {
			
			try {
				
				fw.flush();
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
	}
}
