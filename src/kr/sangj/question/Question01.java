package kr.sangj.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question01 {
	
	List<HashMap<String, Integer>> priceList = new ArrayList<HashMap<String,Integer>>();		
	HashMap<String, Integer> priceMap = new HashMap<String, Integer>();
	
    public void changeTest(HashMap<String,Object> map){

    	HashMap<String, Object> resMap = new HashMap<String, Object>();
        
    	/*priceList.add(map);	*/
    }
	
	public void print() {
		
		System.out.println("���󰡰� & ���ϰ���");
		
		for (int i = 10000; i<=20000; i+=1000) {					

			priceMap.put("����", i);
			priceMap.put("���ϰ�", (int)(i - (i * 0.3)));
												
			/*changeTest(priceMap);*/								
		}		
	}
}
