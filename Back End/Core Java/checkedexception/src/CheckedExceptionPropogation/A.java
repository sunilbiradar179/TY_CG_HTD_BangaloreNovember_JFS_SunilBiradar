package CheckedExceptionPropogation;

public class A 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		try
		{
			B.m();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("exeption handeled");
		}
		System.out.println("main ended");
	}

}
