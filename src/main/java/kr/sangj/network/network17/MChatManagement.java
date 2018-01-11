package main.java.kr.sangj.network.network17;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Vector;

public class MChatManagement {

	Vector<OutputStream> connectedList = new Vector<OutputStream>();

	public void add(OutputStream outputStream) {

		connectedList.add(outputStream);
		System.out.println("connectedList : " + connectedList);
		System.out.println("현재 접속자 수  : " + connectedList.size());
	}

	public void sendToAll(String serverToClientMsg) {

		for (Iterator iterator = connectedList.iterator(); iterator.hasNext();) {
			
			DataOutputStream tmpDataOutputStream = (DataOutputStream) iterator.next();			
			
			try {
				
				tmpDataOutputStream.writeUTF(serverToClientMsg);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}		
	}
}