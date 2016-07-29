package com.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			
			int count = 1;
			while(true){
				tell("loop"+count);
				count++;
				sleep(1000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
