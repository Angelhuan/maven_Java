package com.socket2;

import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {
	
	@Override
	public void run() {
		

		try {
			
			ServerSocket serverSocket = new ServerSocket(12345);
			
			
			while(true){
				java.net.Socket socket = serverSocket.accept();
				JOptionPane.showMessageDialog(null, "连接成功！");
				chatSocket cs = new chatSocket(socket);
				cs.start();
				ChatManager.getChatManager().add(cs);
				
			}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
