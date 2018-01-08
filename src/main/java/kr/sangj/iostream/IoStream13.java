package main.java.kr.sangj.iostream;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IoStream13 {

	public void print() {
		
		PrintWriter fw = null;

		
		try {												
			
			fw = new PrintWriter(new BufferedWriter(new FileWriter("C:/IoTest/test.txt",true)));
								
			/*fw.write("어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운"
					+ "어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운예제어려운"
					+ "예제어려운예제어려운예제예제어려운예제어려운예제");*/
			
			//write는 입력할 길이 조절 가능
			fw.print("write와 print의 차이");
			//print 나 println을 이용하면 줄바꿈가능
			
			System.out.println("끝!");
		} catch (Exception e) {
			
		} finally {
			
			fw.flush();
			fw.close();
		}	
	}
}
