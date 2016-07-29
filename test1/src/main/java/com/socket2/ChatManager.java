package com.socket2;

import java.util.Vector;

public class ChatManager {
	
	private ChatManager(){}
	
	private static final ChatManager cm = new ChatManager();
	public static ChatManager getChatManager(){
		return cm;
	}
	
	Vector<chatSocket> vector = new Vector<chatSocket>();
	
	public void add(chatSocket cs){
		vector.add(cs);
	}
	
	
	public void publish(chatSocket cs, String msg){
		for(int i = 0; i < vector.size(); i++){
			chatSocket csChatSocket = vector.get(i);
			if(!csChatSocket.equals(cs)){
				csChatSocket.tell(msg);
			}
		}
	}
	
	
	
	
	
}
