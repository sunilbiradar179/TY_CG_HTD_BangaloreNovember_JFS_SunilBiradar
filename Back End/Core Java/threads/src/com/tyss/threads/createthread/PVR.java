package com.tyss.threads.createthread;

public class PVR
{
	synchronized public void confirmTicket()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
			
			/*try
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e)
			{
			e.getMessage();			
			}*/
			try {
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.getMessage();
			}
		}
	}
	synchronized public void leaveMe()
	{
		System.out.println("notify called");
		notify();
	}

}
