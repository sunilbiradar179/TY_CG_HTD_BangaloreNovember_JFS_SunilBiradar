
public class TestRobot
{	//achiving multiple inheritance
	public static void main(String[] args)
	{
		
		Movement r1=new Robot();//we can give interface type reference to class object
		Sound s1=new Robot();
		r1.move();
		s1.talk();
		System.out.println("==========");
		
		Robot r2=new Robot();
		r2.move();
		r2.talk();
	}

}
