package com.tyss.threads.createthread;

public class User1 extends Thread
{
	IRCTC i;

	public User1(IRCTC i) {
		this.i = i;
	}
	
	public void run()
	{
		i.confirmTicket();
	
	}
	

}
