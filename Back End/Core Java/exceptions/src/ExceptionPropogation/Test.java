package ExceptionPropogation;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		GoogleMap g1=new GoogleMap();
		Ola ol=new Ola(g1);
		ol.find(null);
		System.out.println("main ended");
	}

}
