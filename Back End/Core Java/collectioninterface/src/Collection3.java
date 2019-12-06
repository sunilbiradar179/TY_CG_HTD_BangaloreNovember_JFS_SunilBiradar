import java.util.ArrayList;
import java.util.Collection;

public class Collection3
{
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		c2.add(50);
		c2.add(40);
		c2.add(30);
		c2.add(80);
		System.out.println(c2);
		
		
		c1.addAll(c2);
		System.out.println(c1);
		
		System.out.println("---------removeAll---------");
		c1.removeAll(c2);
		System.out.println(c1);
		
		Collection c3=new ArrayList<>();
		c3.add(13);
		c3.add(25);
		c3.add(37);
		c3.add(43);
		System.out.println(c3);
		
		Collection c4=new ArrayList<>();
		c4.add(13);
		c4.add(37);
		c4.add(26);
		c4.add(43);
		System.out.println(c4);
		
		System.out.println(c3.containsAll(c4));
		
		
		System.out.println("----retainAll----");
		c3.retainAll(c4);
		System.out.println(c3);
		
		System.out.println("----------contains all------");
		
		System.out.println(c3.containsAll(c4));
		
		
		c4.clear();
		
		System.out.println(c4);
		
		
		
		
		//collection converted to array using toArray() of collection c2
		Object a[]=c2.toArray();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//use of removeIf
		
	}

}
