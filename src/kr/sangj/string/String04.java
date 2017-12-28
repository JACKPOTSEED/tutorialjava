package string_1226;

import java.util.StringTokenizer;

public class String04 {

	StringTokenizer st1 = new StringTokenizer("김기정 박기정 최기정");	
	StringTokenizer st2 = new StringTokenizer("2012-3-13", "-");
	StringTokenizer st3 = new StringTokenizer("2012-3-13", "-",true);
	public int tokenCount = st2.countTokens();
	public int i,j = 0;
		
	public void print() {
		
		System.out.println("tokenCount : " + tokenCount);
		
		while(st2.hasMoreTokens()) {
						
			i++;
			System.out.println(i +" attempt st2.nextToken() :" + st2.nextToken());
		}
		
		System.out.println("==========================");
		
		while(st3.hasMoreTokens()) {
			j++;
			System.out.println(j +" attempt st3.nextToken() :" + st3.nextToken());
		}
		
	}
}
