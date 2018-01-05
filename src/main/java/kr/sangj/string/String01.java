package main.java.kr.sangj.string;

import java.util.concurrent.SynchronousQueue;

/**
 * @author sangj
 * @since  2017.12.27
 */
public class String01 {

	public void print() {
		
		String str1 = "java";
		String str2 = new String("Programming");
		String str3 = str1.concat(str2);		
		
		StringBuilder sb = new StringBuilder();			
		sb.append(str1);
		sb.append(str2);
		
		System.out.println(str1+str2);
		
		System.out.println("============================길이구하기");
		System.out.println("str1 의 길이 : " + str1.length());
		
		System.out.println("============================문자열결합");		
		System.out.println("concat 이용  : " +  str3);							
		System.out.println("StringBuilder 이용 : " + sb.toString());
								
												
	}
}
