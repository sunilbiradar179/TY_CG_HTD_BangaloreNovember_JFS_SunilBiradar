import java.util.Stack;

public class Stack1
{
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		System.out.println(s1);
		System.out.println("after push()");
		s1.push(40);
		System.out.println(s1);
		System.out.println("after pop()");
		s1.pop();
		System.out.println(s1);
		System.out.println("after peek()");
		
		System.out.println(s1.peek());
		
		System.out.println("after search");
		System.out.println(s1.search(10));
		System.out.println(s1);
	}

}
