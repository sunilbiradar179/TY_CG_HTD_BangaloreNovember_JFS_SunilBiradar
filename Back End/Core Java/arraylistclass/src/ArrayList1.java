import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 
{
	public static void main(String[] args) {
		//Generic type ArrayList
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		System.out.println("-------iterating using for loop-------");
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("-------iterating using for each loop-------");
		for(Integer i1:a1)
		{
			System.out.println(i1);
		}
		
		System.out.println("-------iterating using ITERATOR-------");
		Iterator<Integer> itr1=a1.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("-------iterating using LIST ITERATOR-------");
		ListIterator<Integer> itr2=a1.listIterator(a1.size());
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		
		
		
		
	}

}
