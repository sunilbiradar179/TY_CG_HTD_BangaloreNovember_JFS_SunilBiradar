import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3
{
	public static void main(String[] args)
	{
		
		TreeSet<Employee> t1=new TreeSet<Employee>();
		t1.add(new Employee(12,20000,"sunil"));
		t1.add(new Employee(10,60000,"sathya"));
		t1.add(new Employee(22,30000,"sachin"));
		t1.add(new Employee(34,10000,"suraj"));
		t1.add(new Employee(12,20000,"sunil"));
		
		Iterator<Employee> itr=t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
