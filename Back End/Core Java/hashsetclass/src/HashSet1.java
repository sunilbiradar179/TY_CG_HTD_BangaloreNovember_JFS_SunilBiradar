import java.util.HashSet;

public class HashSet1 
{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("using for each loop");
		for (Object o1 : hs)
		{
			System.out.println(o1);
			
		}
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("sunil");
		hs1.add("sathya");
		hs1.add(null);
		hs1.add("suraj");
		System.out.println(hs1);
		System.out.println("using for each loop");
		for (String s1 : hs1) 
		{
			System.out.println(s1);
			
		}
	}

}
