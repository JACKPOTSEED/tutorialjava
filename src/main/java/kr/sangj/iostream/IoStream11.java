package main.java.kr.sangj.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IoStream11 {

	/* json �̳� xml �� �����ͼ� map �̳� list�� ����� txt�� �Ѹ����� txt�б�
	 * �̿������� ����� gson �ͼ�������
	 * json jsonObjectString ���� ���
	 * xml parser�������
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
				
				System.out.println("����");
				/*System.out.println((char)data);*/
				/*pw.write(data);*/
				pw.write("more more text");
				System.out.println("����Ϸ�");
			}								
			
			
		} catch (Exception e) {

		} finally {
			
			pw.flush();
			pw.close();
		}
	}
}
