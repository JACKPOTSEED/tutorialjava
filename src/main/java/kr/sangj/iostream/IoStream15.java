package main.java.kr.sangj.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoStream15 {

	public void print() {
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader("C:/IoTest/zzz.txt"));
			System.out.println(br.readLine());
			
		} catch (IOException e) {

		}
	}
}
