package main.java.kr.sangj.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question04 {

	// TODO List<Map> 제네릭 두번 사용 하는버 찾아보기
	List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	HashMap<String,Object> resMap = new HashMap<String,Object>();
	
	public void mapInit() {
		
		resMap.put("name", "이상정");
		resMap.put("name", "김철수");
	}
	
	public void listAdd() {
		
		list.add(resMap);
		list.add((HashMap<String, Object>) new HashMap<String,Object>().put("age", "233"));
	}

	@Override
	public String toString() {
		return "Question04 [list=" + list + ", resMap=" + resMap + "]";
	}	
}
