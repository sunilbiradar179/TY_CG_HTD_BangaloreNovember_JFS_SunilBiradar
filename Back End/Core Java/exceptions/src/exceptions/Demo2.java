package exceptions;

public class Demo2 
{
	public static void main(String[] args) {
		System.out.println("main started");
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		
		try 
		{
			a[2]=30;
			a[3]=33;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("there is no size to store data");
		}
		System.out.println("main ended");
	}

}
