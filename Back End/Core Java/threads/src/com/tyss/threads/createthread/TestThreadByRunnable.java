package com.tyss.threads.createthread;

public class TestThreadByRunnable
{
	public static void main(String[] args) {
		System.out.println("main started");
		ThreadByRunnable t1=new ThreadByRunnable();
		
		Thread t=new Thread(t1);
		t.start();
		System.out.println("main ended");
	}

}
