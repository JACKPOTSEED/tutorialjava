package kr.sangj.cast;
/**
 * @author �̻���
 * @since  2017.12.26
 */ 

//�ڷ��� ����ȯ ����
public class ByteTestError {

	public static void main(String[] args) {
		
		byte a = (byte)128;
		System.out.println("128�� ������ byte ���� : " + a);
		
		byte b = (byte)256;
		System.out.println("256�� ������ byte ���� : " + b);
		
		Byte c = new Byte(a);
		Byte d = b;
		
		/*int intA = (int)128;
		System.out.println("128�� ������ int ���� : " + intA);
		
		int intB = (int)256;
		System.out.println("256�� ������ int ���� : " + intB);*/
		
//		Todo int to shrot ����ȯ ����������?
		int in = 30000;
		short sh = 0;
		sh = (short) in;
		System.out.println("sh : " + sh);
	}

}
