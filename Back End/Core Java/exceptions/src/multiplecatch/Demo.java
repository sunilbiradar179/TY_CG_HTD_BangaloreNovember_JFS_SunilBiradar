package multiplecatch;

public class Demo 
{
	public void write(int a,String s)
	{
		try 
		{
			System.out.println(500/a);
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont deal with zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("dont deal with NULL");
		}
	}

}
