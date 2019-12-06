package ThrowsKeyword;

public class IRCTC
{
	public void confirmTicket() throws ClassNotFoundException
	{
		try {
			Class.forName("Paytm");
			
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("IRCTC is telling ticket is not confirmed");
			throw e;
			
		}
	}

}
