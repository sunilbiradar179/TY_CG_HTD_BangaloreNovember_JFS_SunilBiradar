package com.tyss.threads.createthread;

public class IRCTC 
{
	synchronized public void confirmTicket()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
	
	synchronized public void leaveMe()
	{
		System.out.println("notify called");
		notify();
	}

}
