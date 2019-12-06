import java.util.ArrayList;

public class ArrayList3 
{
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		System.out.println(a1.contains(10));
		a1.remove(new Integer(20));//it can not take object directly ---we should give object with new
		System.out.println(a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(50);
		a2.add(60);
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		
		//a1.removeAll(a2);
		System.out.println(a1);
		System.out.println(a1.containsAll(a2));
		
		
		a1.retainAll(a2);
		System.out.println(a1);
		
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(10);
		a3.add(20);
		a3.add(50);
		a3.add(60);
		System.out.println(a3);
		
		a3.add(1, 70);
		System.out.println(a3);
		
		a3.remove(2);
		System.out.println(a3);
		
		System.out.println(a3.indexOf(70));
		
		System.out.println(a3.get(2));
		
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(10);
		a4.add(20);
		a4.add(50);
		a4.add(60);
		System.out.println(a4);
		
		a3.addAll(a4);
		System.out.println(a3);
		
		a3.set(2, 25);
		System.out.println(a3);
		
		
		System.out.println(a3.subList(2, 5));
		
	}

}
