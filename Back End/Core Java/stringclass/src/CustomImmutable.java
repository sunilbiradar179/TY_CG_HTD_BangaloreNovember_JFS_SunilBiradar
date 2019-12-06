
public class CustomImmutable 
{
	private String name;
	private int age;
	public CustomImmutable(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 
	String getName()
	{
		return this.name;
		
	}
	int getAge()
	{
		return this.age;
	}

}
