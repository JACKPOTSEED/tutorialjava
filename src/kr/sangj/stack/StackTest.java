package kr.sangj.stack;

public class StackTest {

	StackExam stackExam = new StackExam();
	
	public void stackInit() {
		
		stackExam.push("�⸰");
		stackExam.push("�ڳ���");
		stackExam.push("ȫ��");
		stackExam.push("�ڻԼ�");
	}
	
	public void print() throws ArrayIndexOutOfBoundsException {
		
		/*stackExam.getArrayTop();*/
		stackInit();			
		
		System.out.println("stackExam.arrayTop() : " + stackExam.getArrayTop());
		System.out.println("stackExam : " + stackExam);
				
		while(!stackExam.isEmpty()) {
			
			String str = stackExam.pop();
			
			System.out.println("��� �� : " + str);
		}
	}
}
