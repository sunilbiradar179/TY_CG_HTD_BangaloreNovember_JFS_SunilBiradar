import java.util.ArrayList;
import java.util.Collection;

public class Collection2 
{
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		
		c1.add("sunil");
		c1.add(12);
		System.out.println(c1);
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		System.out.println(c1.contains("sunil"));
		
		c1.remove("sunil");
		System.out.println(c1.isEmpty());
	}

}
