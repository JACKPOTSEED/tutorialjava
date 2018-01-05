package main.java.kr.sangj.array;

public class Array01 {

	int arr1[] = {1,2,3,4,5};
	int arr2[] = new int[] {1,2,3,4,5};
	
	boolean flag = (arr1 == arr2);
	boolean flag2 = (arr1.equals(arr2));	
				
	public void print() {
		
		System.out.println("배열의 참조 비교");
		System.out.println(flag);
		System.out.println(flag2); 	
	}	
}
