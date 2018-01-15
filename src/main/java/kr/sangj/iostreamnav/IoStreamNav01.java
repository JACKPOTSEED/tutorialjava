package main.java.kr.sangj.iostreamnav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class IoStreamNav01 {

	public String copyName = "";

	public IoStreamNav01(String copyName) {

		this.copyName = copyName;
	}

	public void copyImgFile() {
		
		InputStream is = null;
		OutputStream os = null;
		int data = -1;
		
		//���
		String root = System.getProperty("user.dir");
		String rootPath = root + "\\src\\main\\resource\\img\\";
		String fileName = "bmo.jpg";
		File rootDir = new File(rootPath + fileName);					
		
		if (!rootDir.isDirectory()) {
			
			System.out.println("������ �����Ƿ� ����");
			rootDir.mkdirs();			
		}		
		try {
						
			is = new FileInputStream(rootPath + fileName);
			os = new FileOutputStream("C:/IoTest/bmo/" + copyName + ".jpg");
		
			while ((data = is.read()) != -1) {
				
				os.write(data);				
			}			
			
			System.out.println("�̹��� ����Ϸ�");
			
		} catch (Exception e) {

			System.out.println("���� �߻�");
		} finally {
			
			try {
				
				is.close();
				os.flush();
				os.close();
				
			} catch (IOException e) {

				System.out.println("IO���� �߻�");
			}				
		}	
	}
}