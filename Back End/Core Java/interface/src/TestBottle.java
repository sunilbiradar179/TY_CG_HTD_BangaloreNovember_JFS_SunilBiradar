
public class TestBottle
{
	public static void main(String[] args) 
	{
		
		Pepsi p1=new Pepsi();
		p1.open();
		p1.drink();
		p1.juice();//this id overrided method
		Bottle.close();//we can access static method from interface using interface name
		System.out.println("---------------");
		Fanta f1=new Fanta();
		f1.open();
		f1.drink();
		f1.juice();//this is default method from interface
		Bottle.close();//we can access static method from interface using interface name
	}

}
