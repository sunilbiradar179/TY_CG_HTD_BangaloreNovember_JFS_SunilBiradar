
public class TestCustomImmutable
{
	public static void main(String[] args) {
		CustomImmutable c1=new CustomImmutable("sunil",22);
		System.out.println(c1.hashCode());
		//c1=new CustomImmutable("sathya",23);
		//System.out.println(c1.hashCode());
		int age=c1.getAge();
		String name=c1.getName();
		System.out.println("name="+name);
		System.out.println("age="+age);
	}

}
