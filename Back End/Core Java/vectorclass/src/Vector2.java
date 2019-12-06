import java.util.Vector;

public class Vector2 
{
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println("checking the size and capacity of empty vector");
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		System.out.println("after added objects check size and capacity");
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		System.out.println("we are using trim to size");
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		System.out.println("using setsize");
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		
		v1.add(100);
		System.out.println(v1.size());
		System.out.println(v1);
		
		System.out.println("using set");
		v1.set(5, 200);
		System.out.println(v1);
		
	}
	
	

}
