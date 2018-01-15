package main.java.kr.sangj.iostream.IoStream17;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FriendFileDaoExam {

	public static void main(String[] args) {

		FileDao fileManager = null;
		
		try {
			
			fileManager = new FileDao("C:/IoTest/friends/friends.dat");
			
			fileManager.saveRecord(new Friend("김기정", 24, 61.24, "010-91460-7528"));
			fileManager.saveRecord(new Friend("박기정", 24, 61.24, "010-91460-7528"));
			fileManager.saveRecord(new Friend("최기정", 24, 61.24, "010-91460-7528"));
			fileManager.saveRecord(new Friend("정기정", 24, 61.24, "010-91460-7528"));
			
			System.out.println("정상적을 등록이 되었습니다.");
			
		} catch (Exception e) {			
			
			e.printStackTrace();
		}
		
		System.out.println("****등록된 모든 친구 리스트" + fileManager.getRecordCount() + "명****");
		
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
