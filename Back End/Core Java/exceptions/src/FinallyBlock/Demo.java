package FinallyBlock;

public class Demo 
{
	public static void main(String[] args) {
		System.out.println("main started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont deal with 0");
		}
		finally
		{
			System.out.println("finally block executed");
		}
		
	}

}
