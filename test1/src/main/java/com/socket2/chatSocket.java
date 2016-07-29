package com.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class chatSocket extends Thread {
	
	private Socket socket;
	
	public chatSocket(Socket socket){
		this.socket = socket;
	}
	
	public void tell(String str){
		try {
			socket.getOutputStream().write(str.getBytes("utf-8"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			String line = null;
			while((line = br.readLine()) != null){
				ChatManager.getChatManager().publish(this, line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
