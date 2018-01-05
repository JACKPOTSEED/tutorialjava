package main.java.kr.sangj.string;

public class String03 {

	String str1 = "java";
	String str2 = new String("Programming");	
	StringBuilder sb = new StringBuilder();	
	
	public void print() {
		
		sb.append(str1);
		sb.append(str2);
		
		System.out.println("========================문자열가지고놀기");
		System.out.println("sb.reverse() : " + sb.reverse());
		System.out.println("sb.reverse() : " + sb.reverse());
		System.out.println(sb.replace(0, 4, "c++"));
		System.out.println(sb.substring(6));
		System.out.println("str1의 몇번째 문자 : " + str1.charAt(2));
		System.out.println("Str2의 r이 몇번째 문자 : " + str2.indexOf('r'));
	}	
}
