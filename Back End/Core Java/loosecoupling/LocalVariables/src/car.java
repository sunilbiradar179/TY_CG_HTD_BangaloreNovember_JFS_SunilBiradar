
public class car extends vehicle 
{
	int cost=100000;
	public void carDetails()
	{
		int cost=100;
		System.out.println("local variable value="+cost);
		System.out.println("global variable value="+this.cost);
		System.out.println("super variable value="+super.cost);
	}

}
