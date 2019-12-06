package exceptions;

public class Calculator
{
	
	public void divide(int a,int b)
	{
		System.out.println("divide method called");
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		System.out.println("divide method ended");
	}

}
