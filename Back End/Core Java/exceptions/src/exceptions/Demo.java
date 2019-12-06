package exceptions;

public class Demo
{
	String s=null;
	public void write()
	{
		try 
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("dont deal with null");
			
		}
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Demo d=new Demo();
		d.write();
		System.out.println("main ended");
	}

}


