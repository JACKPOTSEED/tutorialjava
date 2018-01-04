package kr.sangj.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import kr.sangj.iostream.File01;
import kr.sangj.iostream.IoStream01;
import kr.sangj.iostream.IoStream02;
import kr.sangj.iostream.IoStream03;
import kr.sangj.iostream.IoStream04;
import kr.sangj.iostream.IoStream05;
import kr.sangj.iostream.IoStream07;
import kr.sangj.iostream.IoStream08;

public class IoStreamMain {
	
	public static void main(String[] args) {
		
		/*IoStream01 ioStream01 = new IoStream01();
		
		try {
			
			ioStream01.print();
			
		} catch (IOException e) {

			e.printStackTrace();
		}*/
		
		/*IoStream02 ioStream02 = new IoStream02();
		
		try {
			
			ioStream02.print();
			
		} catch (IOException e) {

			e.printStackTrace();
		}*/
		
		/*IoStream03 ioStream03 = new IoStream03();
		
		try {
			
			ioStream03.print();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		IoStream04 ioStream04 = new IoStream04();
		
		ioStream04.print();*/
		
		/*IoStream05 ioStream05 = new IoStream05();
		ioStream05.print();*/
		
		/*File01 file01 = new File01("riris8756", 201485024);
		file01.print();*/
		
		/*IoStream07 ioStream07 = new IoStream07();
		try {
			ioStream07.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		IoStream08 ioStream08 = new IoStream08();
		ioStream08.insertFile();
	}	
}