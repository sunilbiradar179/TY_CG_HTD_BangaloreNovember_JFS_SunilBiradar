package ExceptionPropogation;

public class GoogleMap 
{
	public void findLocation(String loc)
	{
		try
		{
		System.out.println(loc.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("google user please fill location");
			throw n;
		}
	}

}
