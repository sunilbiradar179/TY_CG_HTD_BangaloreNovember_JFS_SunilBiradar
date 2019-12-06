
public class TestAnimal 
{
	public static void main(String[] args) {
		Dog d1=new Dog("pinky");
		System.out.println(d1.name);
		
		//Animal a1=new Dog("tommy");
		//System.out.println(a1.name);
		System.out.println("----------------");
		
		Animal.cost=10;
		System.out.println(Animal.cost);
	}

}
