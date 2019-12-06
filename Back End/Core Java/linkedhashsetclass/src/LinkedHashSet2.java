import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		l1.add(20);
		l1.add(24);
		l1.add(20);
		l1.add(10);
		
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
