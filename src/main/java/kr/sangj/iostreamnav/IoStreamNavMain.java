package main.java.kr.sangj.iostreamnav;

public class IoStreamNavMain {
	
	public static void main(String[] args) {
		
		/**
		 * InputStream OutputStream을 이용한 그림파일 복사
		 * 생성자 매개변수 복사 파일명 (확장자 .jpg 고정)
		 */
		/*IoStreamNav01 IoStreamNav01 = new IoStreamNav01("cmo");
		IoStreamNav01.copyImgFile();*/
		
		/**
		 * Reader Writer를 이용한 텍스트파일 복사
		 */
		/*IoStreamNav02 ioStreamNav02 = new IoStreamNav02();
		ioStreamNav02.copyTextFile();*/
		
		/**
		 * 버퍼를 이용한 성능향상 텍스트파일 복사
		 */
		/*IoStreamNav03 ioStreamNav03 = new IoStreamNav03();
		ioStreamNav03.editTextFile();*/
		
		/*IoStreamNav04 ioStreamNav04 = new IoStreamNav04();
		ioStreamNav04.copyByteTextFile();*/
		
		IoStreamNav05 ioStreamNav05 = new IoStreamNav05();
		ioStreamNav05.printDataStream();
	}
}
