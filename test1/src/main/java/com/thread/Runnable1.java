package com.thread;

public class Runnable1 implements Runnable{

	private String name;
	public Runnable1(String name){
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println(name + ":"+ i);
		}
	}

}
