package finalkeyword;

public class InstanceBlock 
{
	 final int MAXIMUM;
	 static final int MINIMUM;
	public InstanceBlock()
	{
		System.out.println("constructor called");
	}
	{
		System.out.println("instance block executed");
		MAXIMUM=300;
		System.out.println(MAXIMUM);
	
	}
	static 
	{
		System.out.println("static block executed");
		MINIMUM=30;
	}

}
