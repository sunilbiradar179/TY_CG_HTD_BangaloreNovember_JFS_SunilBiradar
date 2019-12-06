import java.util.ArrayList;
import java.util.List;

public class List1
{
	public static void main(String[] args) {
		
		List l1=new ArrayList();
		
		//add
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		
		//remove
		System.out.println("-----remove----");
		l1.remove(2);
		System.out.println(l1);
		
		//indexOf
		System.out.println("-----indexof----");
		System.out.println(l1.indexOf(40));
		
		//lastIndexOf
		System.out.println("-----lastindexof----");
		l1.add(50);
		l1.add(30);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(30));
		
		//get
		System.out.println("-----get----");
		System.out.println(l1.get(1));
		
		//addAll(it add elements and dont bother about duplicates)
		List l2=new ArrayList();
		l2.add(70);
		l2.add(80);
		l2.add(90);
		l2.add(110);
		
		System.out.println(l2);
		
		List l3=new ArrayList();
		l3.add(70);
		l3.add(80);
		l3.add(190);
		l3.add(120);
		System.out.println(l3);
		System.out.println("-----addall----");
		
		l2.addAll(l3);
		System.out.println(l2);
		
		//set(it replaces the value)
		System.out.println("-----ser----");
		l2.set(2, 50);
		System.out.println(l2);
		
		//sublist
		System.out.println("-----sublist----");
		
		System.out.println(l2.subList(1, 4));
		
		//fetching elements using for loop
		System.out.println("-----fetching elements usin for loop----");
		
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
	}

}
