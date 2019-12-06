package CustomException;

public class AtmSimulator
{
	void withdraw(int amount)
	{
		if(amount>40000)
		{
			throw new DayLimitException();
		}
	}

}
