package main.java.kr.sangj.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IoStream11 {

	/* json 이나 xml 값 가져와서 map 이나 list로 만들엇 txt에 뿌린다음 txt읽기
	 * 이예제에서 사용할 gson 익숙해지기
	 * json jsonObjectString 개념 잡기
	 * xml parser개념잡기
	 */
	
	public void print() {
		
		FileReader fr = null;
		BufferedReader br = null;		
		int data = -1;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {

			fr = new FileReader("C:/IoTest/test.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("C:/IoTest/test.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);			
			
			while ((data = br.read()) != -1) {
				
				System.out.println("실행");
				/*System.out.println((char)data);*/
				/*pw.write(data);*/
				pw.write("more more text");
				System.out.println("저장완료");
			}								
			
			
		} catch (Exception e) {

		} finally {
			
			pw.flush();
			pw.close();
		}
	}
}
