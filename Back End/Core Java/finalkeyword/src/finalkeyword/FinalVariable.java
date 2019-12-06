package finalkeyword;

public class FinalVariable 
{
	final double PI;
	int x;
	
	public FinalVariable(double PI)
	{
		this.PI=PI;
	}
	public FinalVariable(int a,double PI)
	{
		this.PI=PI;
		 x=a;
	}
	public void piValue()
	{
		System.out.println("value="+PI);
		System.out.println("int value="+x);
	}

}
