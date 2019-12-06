package multiplecatch;

public class NestedTryCatch
{
	public void write(int a,String b)
	{
		try
		{
			System.out.println(500/a);
			try
			{
				System.out.println(b.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("dont deal with null");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont deal with zero");
		}
		
	}

}
