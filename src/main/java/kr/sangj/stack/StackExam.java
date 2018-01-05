package main.java.kr.sangj.stack;

import java.util.ArrayList;

public class StackExam {
	
	private ArrayList<String> a;
		
	public StackExam() {
		
		a = new ArrayList<String>();
	}	
	
	public boolean isEmpty() {
		
		return a.isEmpty();
	}
	
	public void push(String x) {
		
		a.add(x);
	}	
	
	public String pop() {

		String last;
		last = a.remove((a.size()-1));
		
		return last;
	}
	
	public String getArrayTop()
    {
        return(a.get(a.size() -1));
    }
	
	public void clear() {
		
		a.clear();
	}
	
	@Override
	public String toString() {
		return "StackExam [a=" + a + "]";
	}
}
