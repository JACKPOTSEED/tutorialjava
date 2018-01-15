package main.java.kr.sangj.iostream.IoStream17;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FriendFileDaoExam {

	public static void main(String[] args) {

		FileDao fileManager = null;
		
		try {
			
			fileManager = new FileDao("C:/IoTest/friends/friends.dat");
			
			fileManager.saveRecord(new Friend("�����", 24, 61.24, "010-91460-7528"));
			fileManager.saveRecord(new Friend("�ڱ���", 24, 61.24, "010-91460-7528"));
			fileManager.saveRecord(new Friend("�ֱ���", 24, 61.24, "010-91460-7528"));
			fileManager.saveRecord(new Friend("������", 24, 61.24, "010-91460-7528"));
			
			System.out.println("�������� ����� �Ǿ����ϴ�.");
			
		} catch (Exception e) {			
			
			e.printStackTrace();
		}
		
		System.out.println("****��ϵ� ��� ģ�� ����Ʈ" + fileManager.getRecordCount() + "��****");
		
		try {
			
			ArrayList<Friend> list = (ArrayList<Friend>) fileManager.getRecord();
			
			for (Friend friend : list) {
			
				System.out.println(friend);
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		fileManager.close();
		
	}

}
