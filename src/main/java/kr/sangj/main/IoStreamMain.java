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
import main.java.kr.sangj.iostream.IoStream06;
import main.java.kr.sangj.iostream.IoStream07;
import main.java.kr.sangj.iostream.IoStream08;
import main.java.kr.sangj.iostream.IoStream09;
import main.java.kr.sangj.iostream.IoStream10;
import main.java.kr.sangj.iostream.IoStream11;
import main.java.kr.sangj.iostream.IoStream12;
import main.java.kr.sangj.iostream.IoStream13;
import main.java.kr.sangj.iostream.IoStream15;
import main.java.kr.sangj.iostream.IoStream16;
import main.java.kr.sangj.iostream.IoStream18;
import main.java.kr.sangj.iostream.IoStream19;
import main.java.kr.sangj.iostreamnav.IoStreamNav01;
import main.java.kr.sangj.iostreamnav.IoStreamNav02;
import main.java.kr.sangj.iostreamnav.IoStreamNav03;
import main.java.kr.sangj.iostreamnav.IoStreamNav05;
import main.java.kr.sangj.iostreamnav.IoStreamNav06;
import main.java.kr.sangj.iostreamnav.IoStreamNav07.IoStreamNav07;

/**
 * @author sangj
 * @since  2018.01.08
 */

public class IoStreamMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
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
		 * OutputStream Writer 의 차이
		 * TODO 자바는 유니코드 기반의 문자표현을 하고 숫자를 인코딩하여서 값을 뽑는것에서
		 * 차이가 있는것 같긴한데 많은 시간을 들여 공부해야 할 것 같음.
		 */
		
		/*IoStream06 ioStream06 = new IoStream06();
		ioStream06.print();*/
		
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
		
		/**
		 * InputStream OutputStream을 이용한 그림파일 복사
		 * 생성자 매개변수 복사 파일명 (확장자 .jpg 고정)
		 */
		/*IoStreamNav01 IoStreamNav01 = new IoStreamNav01("dmo");
		IoStreamNav01.copyImgFile();*/
		
		/**
		 * Reader Writer 의 reader read(char[] c) Write 사용
		 */
		/*IoStreamNav02 ioStreamNav02 = new IoStreamNav02();
		ioStreamNav02.copyTextFile();*/
		
		/**
		 * 버퍼를 이용한 성능향상 텍스트파일 생성
		 */
		/*IoStreamNav03 ioStreamNav03 = new IoStreamNav03();
		ioStreamNav03.editTextFile();*/
		
		/**
		 * InputStream Reader BufferedReader 를 통한 stream to reader 사용
		 */
		/*IoStreamNav04 ioStreamNav04 = new IoStreamNav04();
		ioStreamNav04.copyByteTextFile();*/
		
		/**
		 * DataOutputStream 을 통한 writeInt 특정 자료형을 저장
		 */
		/*IoStreamNav05 ioStreamNav05 = new IoStreamNav05();
		ioStreamNav05.printDataStream();*/
		
		/**
		 * BufferedWriter FileWriter(file,true) 를 통한 수정 
		 */		
		/*IoStreamNav06 ioStreamNav06 = new IoStreamNav06();
		ioStreamNav06.editAdd();*/
		
		/**
		 * DataOutputStream 
		 */
		/*IoStream16 ioStream16 = new IoStream16();
		ioStream16.dataWrite();*/
		
		/**
		 * IoStream17 RandomAceessFile을 이용한 파일 영속성 처리 클래스 캡슐화
		 */
		
		/**
		 * ObjectInputOutputStream 예제1 다양한 객체를 쓰고 읽기 Serializable를 구현한 기본 자료형
		 */
		
		/*IoStream18 ioStream18 = new IoStream18();
		ioStream18.printObject();*/
		
		/**
		 * DataInputOutputStream writeUTF readUTF 예제
		 * TODO 하지만 값을 write할떄 맨처음에 쓰레기 값이 들어감 
		 */ 
		/*IoStream19 ioStream19 = new IoStream19();
		ioStream19.dataIOStream();*/
		
		/**ObjectInputOutputStream 예제2 Serializable을 구현하고 있지 않은 클래스
		 * 객체 직렬화와 trasient 예약어
		 */
		
		/*IoStreamNav07 ioStreamNav07 = new IoStreamNav07();
		ioStreamNav07.print();*/
	}	 
}