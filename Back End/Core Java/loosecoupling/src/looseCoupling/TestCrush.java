package looseCoupling;

public class TestCrush
{
	public static void main(String[] args)
	{
		
		Phone p1=new Phone();
		BasicSet b1=new BasicSet();
		Oppo o1=new Oppo();
		OnePlus o2=new OnePlus();
		Apple a1=new Apple();
		Crush c1=new Crush();
		 c1.receive(o2);
		
	}

}
