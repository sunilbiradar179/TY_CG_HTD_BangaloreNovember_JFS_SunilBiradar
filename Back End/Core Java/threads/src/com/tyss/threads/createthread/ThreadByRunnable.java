package com.tyss.threads.createthread;

public class ThreadByRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<4;i++)
			System.out.println(i);
	}

}
