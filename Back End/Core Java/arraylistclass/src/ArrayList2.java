import java.util.ArrayList;

public class ArrayList2 
{
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("sunil");
		a1.add("sathya");
		a1.add("sachin");
		a1.add("suraj");
		
		System.out.println(a1);
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("sunil"));
		a1.remove("sunil");
		System.out.println(a1);
	}

}
