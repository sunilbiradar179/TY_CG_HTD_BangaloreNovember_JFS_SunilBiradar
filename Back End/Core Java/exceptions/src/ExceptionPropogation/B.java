package ExceptionPropogation;

public class B 
{
	static void p()
	{
		try
		{
			C.q();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
