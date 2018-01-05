package main.java.kr.sangj.iostreamnav;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamNav03 {

	public void editTextFile() {
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		String data = null;
		
		try {

			bw = new BufferedWriter(new FileWriter("C:/IoTest/test.txt"));			
			bw.write("수정한 글자들입니다");
			
			bw.flush();
			bw.close();
			
			br = new BufferedReader(new FileReader("C:/IoTest/test.txt"));			
			
			while ((data = br.readLine()) != null) {
				
				System.out.println(data);
			}
			
		} catch (Exception e) {

		} finally {
			
			try {
				
				br.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
