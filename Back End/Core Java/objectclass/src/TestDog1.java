
public class TestDog1 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog1 d1=new Dog1("pinky");
		Class c1=d1.getClass();
		Dog1 d2=(Dog1) c1.newInstance();
		System.out.println(c1);
		System.out.println(d2.name);
		Class c2=Class.forName("Dog1");
		Dog1 d3=(Dog1) c2.newInstance();
		System.out.println(c2);
		System.out.println(d3.name);
	}

}
