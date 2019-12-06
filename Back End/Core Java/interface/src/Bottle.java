
public interface Bottle
{
	void open();
	void drink();
	static void close()
	{
		System.out.println("Bottle closed");
	}
	default void juice()
	{
		System.out.println("fanta juice");
	}

}
