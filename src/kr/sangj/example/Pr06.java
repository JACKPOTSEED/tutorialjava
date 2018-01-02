package kr.sangj.example;

import java.util.Iterator;

public class Pr06 {
			
	int arr[] = {1,2,3,4,5,6};
	
	public void print() {
		
		/*for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			type type = (type) iterator.next();
			
		}*/
					
		for (int i : arr) {
			
			System.out.println("향상된 for문 "+ i);
		}
	}  	
 }