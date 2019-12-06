import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(null);
		l1.add(40);
		
		ListIterator ltr=l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		l1.remove(null);
		System.out.println(l1);
		
		System.out.println("-------iterate using for each loop-------");
		for (Object i1 : l1) 
		{
			System.out.println(i1);
			
		}
		
		System.out.println("-----iterate using for loop-----");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	}

}
