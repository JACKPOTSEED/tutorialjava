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
			
			System.out.println("폴더가 존재하지않으면 생성.");
			rootDir.mkdirs();			
		}
		
		String path = rootPath + (email + "\\");
		File dir 	= new File(path);
		
		System.out.println("path : " + path);
		
		
		if (!dir.isDirectory()) {
			
			System.out.println("이메일 폴더가 존재하지않으면 생성.");
			dir.mkdirs();
		}
	}
}
