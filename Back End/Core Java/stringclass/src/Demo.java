
public class Demo 
{
	public static void main(String[] args) {
		String s1="sunil";//refer to same object
		System.out.println("s1 hashcode"+s1.hashCode());
		String s2="sathya";
		s1="surya";
		String s4="sunil";//refer to same object
		String s5="sunil";//refer to same object
		
		System.out.println("s1 hashcode"+s1.hashCode());
		System.out.println("s2 hashcodde"+s2.hashCode());
		System.out.println("s4 hashcode"+s4.hashCode());
		System.out.println("s5 hashcode"+s5.hashCode());
	}

}
