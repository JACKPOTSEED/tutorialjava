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
	 * ArrayList�� Map�� �߰��ϴ� ����
	 * map�� Key���� ����  ������ ����Ʈ�� �߰��Ҷ� �ּҸ� �����ϱ⶧���� ������ �� �� �ִ�. 
	 */
	public void priceSale() {
		
		for (int i = 10000; i<=20000; i+=1000) {					

			priceMap.put("����", i);
			priceMap.put("���ϰ�", (int)(i - (i * 0.3)));
						
			/* �������� �ڵ�
			 * priceList.add(priceMap);*/
			
			// A. clone�޼ҵ带 ����ؼ�  resMap�� ��ü����
			// TODO ���Ŀ� ��������� �������翡 ���ؼ� �˾ƺ���
			resMap = (HashMap<String, Integer>) priceMap.clone();			
			
			priceList.add(resMap);			
		}
	}
	
	public void print() {
		
		System.out.println("���󰡰� & ���ϰ���");		
		System.out.println(priceList);
	}
}
