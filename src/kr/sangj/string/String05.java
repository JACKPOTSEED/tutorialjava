package kr.sangj.string;

public class String05 {

	public void print() { 
		
		String str1 = "2012-03-13";
		
		String arr[] = str1.split("-");
		
		for (int i = 0; i < arr.length; i++) {
		
			System.out.println("arr : " + arr[i]);
		}
		
	}
}
