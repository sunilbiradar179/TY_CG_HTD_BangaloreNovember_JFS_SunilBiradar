import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3
{
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(11,"sunil"));
		l1.add(new Employee(21,"sathya"));
		l1.add(new Employee(11,"sunil"));//wee have to override equals() and hashcode() from object class to Employee class to avoid duplication
		
		Iterator<Employee> itr=l1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());// we have to override toString() from object class in Employee class otherwise it will not show proper values
		}
		
	}

}
