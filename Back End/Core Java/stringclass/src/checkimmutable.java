
public class checkimmutable 
{
	public static void main(String[] args) {
		String s1=new String("sunil");
		System.out.println(s1.hashCode());
		s1=s1.concat("biradar");
		System.out.println(s1.hashCode());
	}

}
