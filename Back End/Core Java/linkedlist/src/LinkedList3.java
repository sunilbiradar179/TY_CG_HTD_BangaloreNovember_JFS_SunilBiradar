import java.util.LinkedList;

public class LinkedList3 
{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		
		System.out.println("---peek and peekfirst and peeklast--");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println("poll and pollfirst and polllast");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		
		System.out.println("new list");
		LinkedList l2=new LinkedList();
		l2.add(100);
		l2.add(200);
		l2.add(100);
		l2.add(300);
		l2.add(400);
		System.out.println(l2);
		
		
		System.out.println("offer and offerfirst and offerlast");
		l2.offer(111);
		System.out.println(l2);
		l2.offerFirst(2222);
		System.out.println(l2);
		l2.offerLast(1212);
		System.out.println(l2);
	}

}
