package CustomCheckedException;

public class Election 
{
	public void vote(int age) throws AgeLimitException
	{
		if(age<18)
		{
			throw new AgeLimitException();
		}
		else
		{
			System.out.println("alloweed to vote");
		}
	}

}
