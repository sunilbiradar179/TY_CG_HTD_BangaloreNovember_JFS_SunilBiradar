package exceptions;

public class TestCalculator 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		Calculator c1=new Calculator();
		c1.divide(10, 0);
		System.out.println("main ended");
	}

}
