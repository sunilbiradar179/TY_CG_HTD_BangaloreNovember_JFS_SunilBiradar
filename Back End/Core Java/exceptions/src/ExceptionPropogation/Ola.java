package ExceptionPropogation;

public class Ola 
{
	GoogleMap g1;
	Ola(GoogleMap g1)
	{
		this.g1=g1;
	}
	public void find(String a)
	{
		try
		{
			g1.findLocation(a);
		}
		catch(NullPointerException n)
		{
			System.out.println("ola user please fill location");
		}
		
	}

}
