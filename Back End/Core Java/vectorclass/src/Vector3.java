import java.util.Vector;

public class Vector3 
{
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.add(40);
		System.out.println(v1);
		
		System.out.println("reove using object");
		v1.removeElement(new Integer(20));
		System.out.println(v1);
		
		System.out.println("remove using index");
		v1.removeElementAt(2);
		System.out.println(v1);
		
		Object a1[]=new Object[v1.size()];
		v1.copyInto(a1);
		System.out.println("copying into array with copyinto");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("removing all elements");
		v1.removeAllElements();
		System.out.println(v1);
		
		System.out.println("adding one more vector");
		Vector v2=new Vector();
		v2.addElement(100);
		v2.addElement(200);
		v2.addElement(300);
		v2.add(400);
		System.out.println(v2);
		System.out.println("checking size and capacity");
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		//System.out.println("checking size and capacity after trimtosize()");
		//v2.trimToSize();
		//System.out.println(v2.size());
		//System.out.println(v2.capacity());
		
		System.out.println("checking size and capacity after ensurecapacity()");
		v2.ensureCapacity(6);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		
		
		
	}
	

}
