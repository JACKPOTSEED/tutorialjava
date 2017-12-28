package kr.sangj.cast;
/**
 * @author 이상정
 * @since  2017.12.26
 */ 

//자료형 형변환 예제
public class ByteTestError {

	public static void main(String[] args) {
		
		byte a = (byte)128;
		System.out.println("128을 저장한 byte 값은 : " + a);
		
		byte b = (byte)256;
		System.out.println("256을 저장한 byte 값은 : " + b);
		
		Byte c = new Byte(a);
		Byte d = b;
		
		/*int intA = (int)128;
		System.out.println("128을 저장한 int 값은 : " + intA);
		
		int intB = (int)256;
		System.out.println("256을 저장한 int 값은 : " + intB);*/
		
//		Todo int to shrot 형변환 데이터유실?
		int in = 30000;
		short sh = 0;
		sh = (short) in;
		System.out.println("sh : " + sh);
	}

}
