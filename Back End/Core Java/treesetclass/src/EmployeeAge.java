import java.util.Comparator;

public class EmployeeAge implements Comparator<Employee>//this comparator interface is used for comparing values
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if(o1.age>o2.age)
			return 1;
		else if(o1.age<o2.age)
			return -1;
		else
			return 0;
	}
		

}
