import java.util.LinkedList;

public class LinkedList4 
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		System.out.println(l1);
		
		System.out.println("-----push----");
		l1.push(111);
		System.out.println(l1);
		
		System.out.println("-----pop-------");
		l1.pop();
		System.out.println(l1);
		
		System.out.println("----element--");
		System.out.println(l1.element());
		System.out.println(l1);
	}

}
