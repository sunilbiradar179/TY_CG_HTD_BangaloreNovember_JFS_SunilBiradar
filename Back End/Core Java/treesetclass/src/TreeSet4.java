import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4 
{
	public static void main(String[] args)
	{
		EmployeeAge e1=new EmployeeAge();//in this class wee implements comparator class with employee as generic class and passing object for ordering according to age
		EmployeeName e2=new EmployeeName();
		EmployeeSalary e3=new EmployeeSalary();
		TreeSet<Employee> t1=new TreeSet<Employee>(e1);
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
