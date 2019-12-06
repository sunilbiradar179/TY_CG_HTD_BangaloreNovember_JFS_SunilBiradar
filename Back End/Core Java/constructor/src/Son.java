
public class Son extends Father
{
	Son()
	{
		super(10,"sunil");
		System.out.println("C");
	}
	Son(int age,String name)
	{
		this();
		System.out.println("D");
	}
	
	

}
