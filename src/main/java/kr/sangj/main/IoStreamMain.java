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
		 * InputStream FileInputStream 텍스트파일 Read()
		 */
		/*IoStream01 ioStream01 = new IoStream01();		
		ioStream01.print();*/
		
		/**
		 * InputStream FileInputStream 텍스트파일 Read() ->  OutputStream FileOutputStream 으로 Write()
		 */
		/*IoStream02 ioStream02 = new IoStream02();
		ioStream02.print();*/
		
		/**
		 * Reader FileReader 텍스트파일 Read() -> Writer FileWriter 로 write()
		 */
		/*IoStream03 ioStream03 = new IoStream03();		
		ioStream03.print();*/
		
		/**
		 * PrintStream BufferedOutputStream OutputStream 이용한 println으로 텍스트파일에 println()
		 */
		/*IoStream04 ioStream04 = new IoStream04();		
		ioStream04.print();*/
		
		/**
		 * FileOutputStream으로 문자열 getByte 후 텍스트파일에 write()
		 */
		/*IoStream05 ioStream05 = new IoStream05();
		ioStream05.print();*/
		
		/**
		 * 디렉토리가 없으면 생성 mkdir()
		 */
		/*File01 file01 = new File01("riris8756", 201485024);
		file01.print();*/
		
		/**
		 * Reader FileReader로 텍스트파일 Read() 후 출력
		 */
		/*IoStream07 ioStream07 = new IoStream07();
		ioStream07.print();*/		
		
		/**
		 * InputStream FileInputStream 그림파일 Read() ->  OutputStream FileOutputStream 으로 Write()
		 */
		/*IoStream08 ioStream08 = new IoStream08();
		ioStream08.insertFile();*/
		
		/**
		 * DataInputStream FileInputStream 으로 int, Double 데이터 읽은후 출력
		 */
		/*IoStream09 ioStream09 = new IoStream09();
		ioStream09.print();*/
		
		/**
		 * PrintWriter FileOutputStream 이용한  println() 으로 텍스트파일에 println()
		 */
		/*IoStream10 ioStream10 = new IoStream10();
		ioStream10.print();*/
		
		/**
		 * BufferedReader FileReader -> PrintWriter BufferedWriter FileWriter 으로 텍스트파일에 write
		 */
		/*IoStream11 ioStream11 = new IoStream11();
		ioStream11.print();*/
				
		/**
		 * FileInputStream -> FileOutputStream 연습
		 */
		/*IoStream12 ioStream12 = new IoStream12();
		ioStream12.print();*/
		
		/**
		 * PrintWriter BufferedWriter FileWriter 을 이용한 print()로 텍스트파일에 print()
		 */
		/*IoStream13 ioStresam13 = new IoStream13();
		ioStresam13.print();*/		
		
		/**
		 * FileWriter 텍스트파일 write
		 */
		/*IoStream14 ioStrea14 = new IoStream14();
		ioStrea14.print();*/

		/**
		 * BufferedReader FileReader 로 텍스트파일 readLine()
		 */
		/*IoStream15 ioStream15 = new IoStream15();
		ioStream15.print();*/
	}	
}