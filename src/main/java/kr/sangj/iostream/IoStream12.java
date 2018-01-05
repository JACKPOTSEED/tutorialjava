package main.java.kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream12 {

	public void print() {
		
		FileInputStream fi = null;
		FileOutputStream fo = null; 
		int data = -1;
		
		try {
			
			fi = new FileInputStream("C:/IoTest/test01.txt");
			fo = new FileOutputStream("C:/IoTest/test03.txt");
			
			while ((data = fi.read()) != -1) {
				
				System.out.println(data);
				fo.write(data);
				System.out.println("test ���� test01 �� ���� �Ϸ�");
			}
			
		} catch (Exception e) {
			
			System.out.println("���� �߻�");
		} finally {
			
			try {
				
				fi.close();
				fo.flush();
				fo.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
	}
}
