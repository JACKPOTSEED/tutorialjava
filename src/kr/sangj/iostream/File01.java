package kr.sangj.iostream;

import java.io.File;

public class File01 {

	public String email;	
	public int num;
		
	public File01(String email, int num) {
		
		this.email = email;
		this.num = num;
	}

	public void print() {
		
		String rootPath = "C:\\IoTest\\FileTest\\";
		File rootDir 	= new File(rootPath); 		
		
		if (!rootDir.isDirectory()) {
			
			System.out.println("������ �������������� ����.");
			rootDir.mkdirs();			
		}
		
		String path = rootPath + (email + "\\");
		File dir 	= new File(path);
		
		System.out.println("path : " + path);
		
		
		if (!dir.isDirectory()) {
			
			System.out.println("�̸��� ������ �������������� ����.");
			dir.mkdirs();
		}
	}
}
