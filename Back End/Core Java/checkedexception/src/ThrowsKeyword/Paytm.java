package ThrowsKeyword;

public class Paytm 
{
	IRCTC i1;
	Paytm(IRCTC i1)
	{
		this.i1=i1;
	}
	public void bookTicket()
	{
		try
		{
			i1.confirmTicket();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("paytm says ticket is not confirmed");
		}
	}

}
