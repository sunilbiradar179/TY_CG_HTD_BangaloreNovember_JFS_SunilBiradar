
public class TestPerson
{
	public static void main(String[] args) 
	{
		Person p1=new Person(10);//if wee declare constructor as private we can not access ouside of class
		p1.details();//if we declare method as private we can not access outside of class
		p1.a=10;//if we declare variable as private we can not acees outside of class
	}

}
