package looseCoupling;

public class Crush
{
	public void receive(Phone p)
	{
		if(p instanceof BasicSet)
		{
			System.out.println("thanks");
		}
		else if(p instanceof Oppo)
		{
			System.out.println("thank you");
		}
		else if(p instanceof OnePlus)
		{
			System.out.println("thank you very much");
		}
		else if(p instanceof Apple)
		{
			System.out.println("i love you");
		}
		else
		{
			System.out.println("idiot");
		}
		
	}

}
