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
								
			/*fw.write("�����������������������������������������������������������������������"
					+ "�����������������������������������������������������������������������"
					+ "��������������������������������");*/
			
			//write�� �Է��� ���� ���� ����
			fw.print("write�� print�� ����");
			//print �� println�� �̿��ϸ� �ٹٲް���
			
			System.out.println("��!");
		} catch (Exception e) {
			
		} finally {
			
			fw.flush();
			fw.close();
		}	
	}
}
