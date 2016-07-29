package com.socket;

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
				new chatSocket(socket).start();
				
			}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
