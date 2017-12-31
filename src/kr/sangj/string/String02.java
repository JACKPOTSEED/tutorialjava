package kr.sangj.string;

public class String02 {

	String str1 = "±Ë±‚¡§";
	String str2 = new String("±Ë±‚¡§");
	
	public void print() {
	
		System.out.println("=======================reference∫Ò±≥");		
		System.out.println("str1==str2(2) : " + (str1 == str2));
		System.out.println("str1.equals()  : " + str1.equals(str2));
	}
}
