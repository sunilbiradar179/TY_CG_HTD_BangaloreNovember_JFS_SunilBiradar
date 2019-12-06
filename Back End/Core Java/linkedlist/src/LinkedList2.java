import java.util.LinkedList;

public class LinkedList2 
{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		System.out.println("----adding first and last object---");
		l1.addFirst(11);
		l1.addLast(22);
		System.out.println(l1);
		System.out.println("removing object using normal remove");
		l1.remove();
		System.out.println(l1);
		
		System.out.println("---remove using removefirsr and removelast");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(100);
		l2.add(200);
		l2.add(500);
		System.out.println(l2);
		
		System.out.println("removing using firstoccurance and lastoccurance");
		l2.removeFirstOccurrence(100);
		l2.removeLastOccurrence(200);
		System.out.println(l2);
		
		System.out.println("using getfirst and getlast");
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
	}

}
