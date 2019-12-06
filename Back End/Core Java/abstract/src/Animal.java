
public abstract class Animal
{
	static int cost;
	String name;
	Animal(String name)
	{
		this.name=name;
	}
	{
		System.out.println("non static block executed");
	}
	static 
	{
		System.out.println("static block executed");
	}

}
