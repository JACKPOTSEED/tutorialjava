package main.java.kr.sangj.iostreamnav;

public class IoStreamNavMain {
	
	public static void main(String[] args) {
		
		/**
		 * InputStream OutputStream�� �̿��� �׸����� ����
		 * ������ �Ű����� ���� ���ϸ� (Ȯ���� .jpg ����)
		 */
		/*IoStreamNav01 IoStreamNav01 = new IoStreamNav01("cmo");
		IoStreamNav01.copyImgFile();*/
		
		/**
		 * Reader Writer�� �̿��� �ؽ�Ʈ���� ����
		 */
		/*IoStreamNav02 ioStreamNav02 = new IoStreamNav02();
		ioStreamNav02.copyTextFile();*/
		
		/**
		 * ���۸� �̿��� ������� �ؽ�Ʈ���� ����
		 */
		/*IoStreamNav03 ioStreamNav03 = new IoStreamNav03();
		ioStreamNav03.editTextFile();*/
		
		/*IoStreamNav04 ioStreamNav04 = new IoStreamNav04();
		ioStreamNav04.copyByteTextFile();*/
		
		IoStreamNav05 ioStreamNav05 = new IoStreamNav05();
		ioStreamNav05.printDataStream();
	}
}
