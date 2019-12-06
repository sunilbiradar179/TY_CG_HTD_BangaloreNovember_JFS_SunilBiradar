package CheckedException;

public class ExceptionA 
{
	public static void main(String[] args) {
		System.out.println("main started");
		try
		{
			Class cl=Class.forName("CheckedException.Person");//here we are searching in same package hence it runs normal
			System.out.println("class found");//if we remove checkedException we will get exception
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class is not found");
		}
		System.out.println("main ended");
	}

}
