package com.socket;

import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JOptionPane;

public class Socket_Demo1 {

	public static void main(String[] args) {
		try {


			ServerSocket serverSocket = new ServerSocket(12345);

			java.net.Socket scoket = serverSocket.accept();
			JOptionPane.showMessageDialog(null, "连接成功！");



		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
