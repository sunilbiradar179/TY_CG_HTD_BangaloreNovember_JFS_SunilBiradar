
public class Employee 
{
	int empAge;
	String empName;
	double empSalary;
	
	Employee(int age,String name,double salary)
	{
		empAge=age;
		empName=name;
		empSalary=salary;
	}
	public void printDetails()
	{
		System.out.println("age=" +empAge +" name=" +empName+" salary="+empSalary);
	}

}
