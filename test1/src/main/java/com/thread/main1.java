package com.thread;

public class main1 {
	public static void main(String[] args) {

		/*MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		
		t1.start();
		t2.start();*/
		
		
		Runnable1 r1 = new Runnable1("A");
		Runnable1 r2 = new Runnable1("B");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		
		t1.start();
		t2.start();
		
		
	}
}
