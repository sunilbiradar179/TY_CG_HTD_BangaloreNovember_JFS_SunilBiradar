
public class TestA
{
	public static void main(String[] args)
	{
		int i=10;
		Integer i1=new Integer(i);//Boxing of int
		
		int i2=i1.intValue();//UnBoxing
		
		double d1=12.23;
		
		Double d2=new Double(d1);//Boxing of double
		
		double d3=d2.doubleValue();//UnBoxing of double
		
		
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
	
	
	

}
