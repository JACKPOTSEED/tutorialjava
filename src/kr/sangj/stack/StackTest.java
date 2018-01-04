package kr.sangj.stack;

public class StackTest {

	StackExam stackExam = new StackExam();
	
	public void stackInit() {
		
		stackExam.push("扁赴");
		stackExam.push("内尝府");
		stackExam.push("全切");
		stackExam.push("内辉家");
	}
	
	public void print() throws ArrayIndexOutOfBoundsException {
		
		/*stackExam.getArrayTop();*/
		stackInit();			
		
		System.out.println("stackExam.arrayTop() : " + stackExam.getArrayTop());
		System.out.println("stackExam : " + stackExam);
				
		while(!stackExam.isEmpty()) {
			
			String str = stackExam.pop();
			
			System.out.println("免仿 蔼 : " + str);
		}
	}
}
