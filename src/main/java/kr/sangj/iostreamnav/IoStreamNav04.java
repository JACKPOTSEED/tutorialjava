package main.java.kr.sangj.iostreamnav;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IoStreamNav04 {

	public void copyByteTextFile() {
		
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		int data  = -1;
		String bData = "";
		
		try {
			
			System.out.println("-----------------------");
			
			is = new FileInputStream("C:/IoTest/test.txt");						
			br = new BufferedReader(new InputStreamReader(is));
			
			os = new FileOutputStream("C:/IoTest/copyConvert12345.txt");
			bw = new BufferedWriter(new OutputStreamWriter(os));
			
			/*while ((data = is.read()) != -1) {
				
				System.out.print((char)data);				
				os.write(data);				
			}
			
			System.out.println();
			System.out.println("����Ʈ��Ʈ���� text���� ���� ����");*/
			
			while ((bData = br.readLine()) != null) {
				
				System.out.println("bData : " + bData);
				bw.write("����?");
				bw.write(bData);
				
			}
			System.out.println("-----------------------");			
			System.out.println("����Ʈ��Ʈ���� text���� -> inputStreaReader�� ���� ���ڽ�Ʈ������ ��ȯ ���� ����");
			
		} catch (Exception e) {

		} finally {
			
			try {
				
				/*is.close();
				os.flush();
				os.close();*/
				
				br.close();
				bw.flush();
				bw.close();
				
			} catch (IOException e) {
						
			}			
		}
	}
}
