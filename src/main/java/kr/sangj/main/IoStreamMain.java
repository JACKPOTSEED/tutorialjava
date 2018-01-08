package main.java.kr.sangj.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import main.java.kr.sangj.iostream.File01;
import main.java.kr.sangj.iostream.IoStream14;
import main.java.kr.sangj.iostream.IoStream01;
import main.java.kr.sangj.iostream.IoStream02;
import main.java.kr.sangj.iostream.IoStream03;
import main.java.kr.sangj.iostream.IoStream04;
import main.java.kr.sangj.iostream.IoStream05;
import main.java.kr.sangj.iostream.IoStream07;
import main.java.kr.sangj.iostream.IoStream08;
import main.java.kr.sangj.iostream.IoStream09;
import main.java.kr.sangj.iostream.IoStream10;
import main.java.kr.sangj.iostream.IoStream11;
import main.java.kr.sangj.iostream.IoStream12;
import main.java.kr.sangj.iostream.IoStream13;
import main.java.kr.sangj.iostream.IoStream15;

/**
 * @author sangj
 * @since  2018.01.08
 */

public class IoStreamMain {
	
	public static void main(String[] args) throws IOException {
		
		/**
		 * InputStream FileInputStream �ؽ�Ʈ���� Read()
		 */
		/*IoStream01 ioStream01 = new IoStream01();		
		ioStream01.print();*/
		
		/**
		 * InputStream FileInputStream �ؽ�Ʈ���� Read() ->  OutputStream FileOutputStream ���� Write()
		 */
		/*IoStream02 ioStream02 = new IoStream02();
		ioStream02.print();*/
		
		/**
		 * Reader FileReader �ؽ�Ʈ���� Read() -> Writer FileWriter �� write()
		 */
		/*IoStream03 ioStream03 = new IoStream03();		
		ioStream03.print();*/
		
		/**
		 * PrintStream BufferedOutputStream OutputStream �̿��� println���� �ؽ�Ʈ���Ͽ� println()
		 */
		/*IoStream04 ioStream04 = new IoStream04();		
		ioStream04.print();*/
		
		/**
		 * FileOutputStream���� ���ڿ� getByte �� �ؽ�Ʈ���Ͽ� write()
		 */
		/*IoStream05 ioStream05 = new IoStream05();
		ioStream05.print();*/
		
		/**
		 * ���丮�� ������ ���� mkdir()
		 */
		/*File01 file01 = new File01("riris8756", 201485024);
		file01.print();*/
		
		/**
		 * Reader FileReader�� �ؽ�Ʈ���� Read() �� ���
		 */
		/*IoStream07 ioStream07 = new IoStream07();
		ioStream07.print();*/		
		
		/**
		 * InputStream FileInputStream �׸����� Read() ->  OutputStream FileOutputStream ���� Write()
		 */
		/*IoStream08 ioStream08 = new IoStream08();
		ioStream08.insertFile();*/
		
		/**
		 * DataInputStream FileInputStream ���� int, Double ������ ������ ���
		 */
		/*IoStream09 ioStream09 = new IoStream09();
		ioStream09.print();*/
		
		/**
		 * PrintWriter FileOutputStream �̿���  println() ���� �ؽ�Ʈ���Ͽ� println()
		 */
		/*IoStream10 ioStream10 = new IoStream10();
		ioStream10.print();*/
		
		/**
		 * BufferedReader FileReader -> PrintWriter BufferedWriter FileWriter ���� �ؽ�Ʈ���Ͽ� write
		 */
		/*IoStream11 ioStream11 = new IoStream11();
		ioStream11.print();*/
				
		/**
		 * FileInputStream -> FileOutputStream ����
		 */
		/*IoStream12 ioStream12 = new IoStream12();
		ioStream12.print();*/
		
		/**
		 * PrintWriter BufferedWriter FileWriter �� �̿��� print()�� �ؽ�Ʈ���Ͽ� print()
		 */
		/*IoStream13 ioStresam13 = new IoStream13();
		ioStresam13.print();*/		
		
		/**
		 * FileWriter �ؽ�Ʈ���� write
		 */
		/*IoStream14 ioStrea14 = new IoStream14();
		ioStrea14.print();*/

		/**
		 * BufferedReader FileReader �� �ؽ�Ʈ���� readLine()
		 */
		/*IoStream15 ioStream15 = new IoStream15();
		ioStream15.print();*/
	}	
}