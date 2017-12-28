package kr.sangj.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question01 {
	
	List<HashMap<String, Integer>> priceList = new ArrayList<HashMap<String,Integer>>();		
	HashMap<String, Integer> priceMap = new HashMap<String, Integer>();
	HashMap<String, Integer> resMap = new HashMap<String,Integer>();		
	
	public Question01() {
		
		priceSale();
	}
	
	/**
	 * ArrayList에 Map을 추가하는 예제
	 * map에 Key값이 같은  정보를 리스트에 추가할때 주소를 저장하기때문에 오류가 날 수 있다. 
	 */
	public void priceSale() {
		
		for (int i = 10000; i<=20000; i+=1000) {					

			priceMap.put("정상가", i);
			priceMap.put("세일가", (int)(i - (i * 0.3)));
						
			/* 오류나는 코드
			 * priceList.add(priceMap);*/
			
			// A. clone메소드를 사용해서  resMap에 객체복사
			// TODO 추후에 얕은복사와 깊은복사에 대해서 알아보기
			resMap = (HashMap<String, Integer>) priceMap.clone();			
			
			priceList.add(resMap);			
		}
	}
	
	public void print() {
		
		System.out.println("정상가격 & 세일가격");		
		System.out.println(priceList);
	}
}
